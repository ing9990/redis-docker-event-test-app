FROM mysql:latest
FROM redis
FROM openjdk:11

WORKDIR /app
# COPY /build/libs/spring-event-study-0.0.1-SNAPSHOT.jar /app/spring-event-study-0.0.1-SNAPSHOT.jar
CMD ["./gradlew","clean","test","build"]
CMD ["java", "-jar", "/app/spring-event-study-0.0.1-SNAPSHOT.jar"]
EXPOSE 3306