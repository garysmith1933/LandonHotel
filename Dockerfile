# syntax=docker/dockerfile:1

FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "D387_sample_code-0.0.2-SNAPSHOT.jar"]
