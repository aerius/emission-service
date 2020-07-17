# Builder part for maven packaging.
FROM maven:3-openjdk-11 as builder

WORKDIR /app

#First download as many dependencies as possible. This avoids downloading all dependencies each time something in source changes
COPY pom.xml /app
RUN mvn clean package -Dmaven.main.skip -Dmaven.test.skip && rm -r target

#Next do the actual build
COPY . /app
RUN mvn clean package

# Move the resultant jar to a known name so it can be picked up by the final image.
RUN mv target/*.jar app.jar

# Final image containing only the application
FROM openjdk:11-jre-buster

WORKDIR /app

ENV spring.datasource.url="jdbc:postgresql://emission_database/emissions" \
    spring.datasource.username="aerius" \
    spring.datasource.password="aerius"

COPY --from=builder /app/app.jar /app/app.jar

ENTRYPOINT ["java","-jar","app.jar"]
