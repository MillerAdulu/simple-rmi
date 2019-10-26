compile:
		javac com/adulu/RMIInterface.java
		javac com/adulu/client/ClientOps.java
		javac com/adulu/server/ServerOps.java

server:
		java com.adulu.server.ServerOps

client:
		java com.adulu.client.ClientOps

git:
		git push origin master
