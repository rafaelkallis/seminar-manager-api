FROM maven:alpine
COPY . /
RUN mvn -D skipTests=true install
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/seminar-manager-api-0.0.1-SNAPSHOT.jar"]
