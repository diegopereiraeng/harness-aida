# Use a base image with Java runtime
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/myapp.jar myapp.jar

# Scan the application JAR file for vulnerabilities using Aqua Trivy
RUN trivy fs --exit-code 1 --no-progress /app

# Run the Java application
CMD ["java", "-jar", "myapp.jar"]
