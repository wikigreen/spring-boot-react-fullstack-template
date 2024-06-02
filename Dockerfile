FROM eclipse-temurin:21-jre-jammy
ARG JAR_FILE=/usr/app/target/*.jar
RUN mkdir -p "app"
ADD ./target/*.jar "app"
EXPOSE 8181
ENTRYPOINT java -jar /app/*.jar
