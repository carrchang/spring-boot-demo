### 任务

* 根据 `resources/db/migration/V1.0.0.0_Init.sql` 里面的建表语句完善 `com.example.demo.model.User` 模型；
* 基于MyBatis为 User 模型定义并实现CRUD RESTFul 服务；
* 完善 `resources/templates/home.html` Thymeleaf模版，使用HTML, CSS, JavaScript等技术实现 User 的管理功能，
具体包括查询 User 并用表格展示数据、新增User、修改User、删除 User功能，实现过程中可以使用jQuery， Bootstrap以及Thymeleaf等技术。

> **注意**
> 1. 开始前请先查看 `application.properties` 里面的配置，获得初始用户和密码以及MyBatis配置；
> 2. H2数据库使用的是内存模式，每次启动数据会被重置。

### 默认组件

* [Spring Web](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Security](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [H2Database](http://h2database.com/html/quickstart.html)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Bootstrap](https://getbootstrap.com/docs/4.3/getting-started/introduction)

### 指引

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
