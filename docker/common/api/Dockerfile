# Builder part for maven packaging.
FROM maven:3-eclipse-temurin-17 as builder

WORKDIR /app

# First download as many dependencies as possible. This avoids downloading all dependencies each time something in source changes
COPY source/pom.xml /app
RUN mvn clean package -Dmaven.main.skip -Dmaven.test.skip -Dspring-boot.repackage.skip && rm -r target

# Next do the actual build
COPY source /app
RUN mvn clean package

# Move the resultant jar to a known name so it can be picked up by the final image.
RUN mv target/*.jar app.jar

# Final image containing only the application
FROM debian:bullseye

# Get java from eclipse-temurin image
ENV JAVA_HOME=/opt/java/openjdk
COPY --from=eclipse-temurin:17 $JAVA_HOME $JAVA_HOME
ENV PATH "${JAVA_HOME}/bin:${PATH}"

ENV spring.datasource.url="jdbc:postgresql://emission_database/emissions" \
    spring.datasource.username="aerius" \
    spring.datasource.password="aerius"

COPY --from=builder /app/app.jar /app/app.jar

# Set up a non root account called aerius (debian based)
RUN groupadd -r aerius && useradd -r -g aerius aerius

USER aerius

# Set working directory to a directory a non-root user will have access to
WORKDIR /app

ENTRYPOINT ["java","-jar","app.jar"]
