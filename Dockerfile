# Use the official OpenJDK 17 image
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at the specified location
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/D387_sample_code-0.0.2-SNAPSHOT.jar

# Expose the port your application will listen on (assuming it's 8080)
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "D387_sample_code-0.0.2-SNAPSHOT.jar"]


