FROM openjdk:11
ENV APP_HOME=/usr/app
WORKDIR /usr/app
COPY target/navigatorengine-0.0.1-SNAPSHOT.jar navigatorengine-0.0.1-SNAPSHOT.jar
EXPOSE 9092
CMD ["java", "-jar", "navigatorengine-0.0.1-SNAPSHOT.jar"]