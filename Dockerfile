FROM openjdk:19

ENV ENVIROMENT=prod

MAINTAINER Marcell Dechant <marcell.dechant@proton.me>

EXPOSE 8080

ADD backend/target/backend-0.0.1-SNAPSHOT.jar app.jar

CMD ["sh", "-c", "java -jar /app.jar"]
