FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy your jar file (change name accordingly)
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]