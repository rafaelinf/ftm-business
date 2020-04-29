FROM openjdk:11
ADD target/financial-transaction-business-0.0.1-SNAPSHOT.jar financial-transaction-business-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "financial-transaction-business-0.0.1-SNAPSHOT.jar"]