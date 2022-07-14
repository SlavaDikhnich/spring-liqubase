FROM bellsoft/liberica-openjdk-alpine:17.0.1

USER root

COPY target/spring_liquibase-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]