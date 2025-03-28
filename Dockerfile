# Use official OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy built application JAR file (change to your actual JAR file name)
COPY target/employee-services-1.0-SNAPSHOT.jar app.jar

# Expose the application port (change if needed)
EXPOSE 8000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
