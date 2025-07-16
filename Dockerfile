# Use official OpenJDK image
FROM eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy everything from your repo into the container
COPY . .

# Give execute permission to mvnw (in case it's lost)
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port 8080
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "target/my-portfolio-backend-0.0.1-SNAPSHOT.jar"]
