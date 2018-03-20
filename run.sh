javac *.java
KIEKER=$HOME/.m2/repository/net/kieker-monitoring/kieker/1.13/kieker-1.13-aspectj.jar
java -javaagent:$KIEKER Main
