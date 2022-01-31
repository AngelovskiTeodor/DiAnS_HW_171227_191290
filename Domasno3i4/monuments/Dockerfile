FROM openjdk:11
ENV APP_HOME=/usr/app
WORKDIR /usr/app
COPY /target/monuments-0.0.1-SNAPSHOT.jar monuments-0.0.1-SNAPSHOT.jar
EXPOSE 9091
CMD ["java", "-jar", "monuments-0.0.1-SNAPSHOT.jar"]