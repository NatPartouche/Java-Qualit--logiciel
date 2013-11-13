#!/bin/bash


open -a Safari http://localhost:9000/
open -a Safari http://localhost:8080/

cd /Users/administrateur/Documents/ZenDev/Plugins/sonar-3.7.3/bin/macosx-universal-64/ 
./sonar.sh stop
./sonar.sh start

java -jar /usr/local/opt/jenkins/libexec/jenkins.war


