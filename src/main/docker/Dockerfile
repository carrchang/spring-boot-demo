FROM openjdk:11

RUN groupadd spring-boot && useradd -g spring-boot -m -s /bin/bash spring-boot

RUN mkdir -p /app/spring-boot /app/data

RUN chown -R spring-boot:spring-boot /app

USER spring-boot

ADD spring-boot-demo-1.0.0-SNAPSHOT.jar /app/spring-boot/app.jar

WORKDIR /home/spring-boot

VOLUME /app/data

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/spring-boot/app.jar
