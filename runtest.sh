#!/bin/bash
export CLASSPATH=$CLASSPATH:.:/usr/share/java/junit4.jar
while true; do
  inotifywait  *java && javac *.java && java org.junit.runner.JUnitCore  BowlingTest
done
