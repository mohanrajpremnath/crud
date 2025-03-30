FROM openjdk:21-jdk-slim
COPY build/libs/*.jar /app/rest.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "rest.jar"]