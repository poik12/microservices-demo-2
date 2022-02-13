FROM openjdk:17-oracle
COPY target/*.jar app.jar
ENV JAVA_OPTS=""
EXPOSE 8200
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS - Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

# in cmd where this service is located
# mvn clean compile package
# docker build --pull --rm -f "Dockerfile" -t product-stock-service:latest "."