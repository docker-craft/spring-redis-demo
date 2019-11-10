FROM docker.sense.io/openjdk:8u212

ADD target/spring-redis-demo-1.0-SNAPSHOT.jar /spring-redis-demo.jar

WORKDIR /

CMD java -jar  spring-redis-demo.jar