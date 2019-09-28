**1. Command for create the docker image**

./mvnw install dockerfile:build

**2. Run the docker container**

docker run -p 8080:8080 --name spring-boot-docker-test springio/spring-boot-docker