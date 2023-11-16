FROM gradle:7.2.0-jdk11 AS build
WORKDIR /home/gradle/src
COPY . .
RUN gradle build

FROM openjdk:11-jdk
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/*.jar ./app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
