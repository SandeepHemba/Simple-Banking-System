# Stage 1: Build the JAR
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

# Stage 2: Run the JAR
FROM openjdk:17-jdk-slim

WORKDIR /app
COPY --from=builder /app/target/SBS-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
