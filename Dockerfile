FROM openjdk:8

# Set the working directory inside the container to /app
WORKDIR /app

# Copy the JAR file from your host machine to the /app directory in the container
COPY target/Test-0.0.1-SNAPSHOT.jar /app

# Run the jar file
CMD ["java", "-jar", "Test-0.0.1-SNAPSHOT.jar"]