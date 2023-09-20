FROM openjdk:19-jdk-alpine
VOLUME /tmp
ADD ./target/sprint-boot-servicio-config-server-0.0.1-SNAPSHOT.jar  config-server.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar","/config-server.jar"]