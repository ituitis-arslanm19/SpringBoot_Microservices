FROM amazoncorretto:11-alpine-jdk
MAINTAINER qrent.com
COPY target/config-server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]