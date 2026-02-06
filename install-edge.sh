#!/bin/bash
mkdir -p target
( cd target && curl -LO https://projectlombok.org/lombok-edge.jar )
mvn install:install-file \
   -Dfile=target/lombok-edge.jar \
   -DgroupId=org.projectlombok \
   -DartifactId=lombok \
   -Dversion=1.18.43-EDGE \
   -Dpackaging=jar \
   -DgeneratePom=true
