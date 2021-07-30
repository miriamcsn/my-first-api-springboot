FROM openjdk:11
COPY build/libs/spring-boot-0.0.1-SNAPSHOT.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "spring-boot-0.0.1-SNAPSHOT.jar"]

