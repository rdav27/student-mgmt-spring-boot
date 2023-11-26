FROM openjdk:11
ADD target/student-mgmt-spring-boot-0.0.1-SNAPSHOT.jar student-mgmt-spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "student-mgmt-spring-boot-0.0.1-SNAPSHOT.jar"]