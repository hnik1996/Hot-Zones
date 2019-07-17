Hot Zones
=========

A service to save hot zones in mongo db and get them and show on map using API

![arch](doc/pic/hot-zones.png)

configuration
-------------

[application.properties](src/main/resources/application.properties)

```
spring.application.name=hot_zones
server.port=8080

#Mongo
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=nekso

```


Installation
------------
1. clone the code
2. configure service with a `application.properties` file in a `config` directory beside jar file  
3. gradlew build package `./gradle build`
4. run application with `java -jar <JAR_FILE>.jar`
5. copy application.properties to build/lib
