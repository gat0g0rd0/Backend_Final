FROM amazoncorretto:8-alpine-jdk
MAINTAINER OCP
COPY target/oscarcalle-0.0.1-SNAPSHOT.jar ocp-backend.jar
ENTRYPOINT ["java","-jar","/ocp-backend.jar"]