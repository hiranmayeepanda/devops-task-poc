# Dockerfile
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the jar file after building it locally
COPY target/taskapp-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","app.jar"]