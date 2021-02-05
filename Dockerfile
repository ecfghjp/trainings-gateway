#Download node docker image java
#Build app#

# RUN stage
#
FROM openjdk:11-jre-slim
COPY target/*.jar /app/training-gateway.jar
WORKDIR /app
CMD ["java","-jar","/app/training-gateway.jar"]
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app/training-gateway.jar" ]
