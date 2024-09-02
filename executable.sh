#/bin/sh

./gradlew assemble --info

java -jar build/libs/java-authorization-web-app.jar 