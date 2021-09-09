FROM java:8

ADD target/RevatureDockerDemo.jar app.jar

ENTRYPOINT [ "java" , "-jar" , "app.jar" ]
