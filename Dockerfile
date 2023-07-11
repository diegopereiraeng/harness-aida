# Use a base image with Java runtime
# FROM adoptopenjdk:11-jre-hotspot
FROM amazoncorretto:11-al2-generic

# Set the working directory in the container
WORKDIR /app

# Set build arguments for harness-aida version
ARG HARNESS_AIDA_VERSION=1.0-SNAPSHOT

# Copy the harness-aida JAR file to the container
COPY target/harness-aida-${HARNESS_AIDA_VERSION}.jar harness-aida.jar

# Run the Java application
CMD ["java", "-jar", "harness-aida.jar"]
