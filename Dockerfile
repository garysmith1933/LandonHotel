# syntax=docker/dockerfile:1

FROM node:14 AS ng-builder
WORKDIR /app
COPY src/main/UI/package.json src/main/UI/package-lock.json ./
RUN npm install -g @angular/cli

RUN npm install
COPY src/main/UI ./
RUN npm run build

FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn clean package

FROM openjdk:17-oracle
WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
