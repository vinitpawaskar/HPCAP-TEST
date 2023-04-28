FROM openjdk:11-jre-slim
ADD docker_test.class /
CMD ["java", "docker_test"]
