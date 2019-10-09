package com.example.demo.component;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.rest.exception.InvalidRequestException;
import org.camunda.bpm.webapp.impl.security.auth.AuthenticationService;
import org.camunda.bpm.webapp.impl.security.auth.Authentications;
import org.camunda.bpm.webapp.impl.security.auth.UserAuthentication;
import org.camunda.bpm.webapp.impl.util.ProcessEngineUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import java.io.IOException;

public class CamundaAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private static final String ENGINE_NAME = "default";

    @Override
    public void onAuthenticationSuccess(
            HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        final ProcessEngine processEngine = ProcessEngineUtil.lookupProcessEngine(ENGINE_NAME);
        if (processEngine == null) {
            throw new InvalidRequestException(
                    Response.Status.BAD_REQUEST, "Process engine with name " + ENGINE_NAME + " does not exist");
        }

        // make sure authentication is executed without authentication :)
        processEngine.getIdentityService().clearAuthentication();

        AuthenticationService authenticationService = new AuthenticationService();
        UserAuthentication userAuthentication = (UserAuthentication) authenticationService.createAuthenticate(
                processEngine, ((User) authentication.getPrincipal()).getUsername(), null, null);

        if (request != null) {
            Authentications.revalidateSession(request, userAuthentication);
        }
        
        super.onAuthenticationSuccess(request, response, authentication);
    }

}
