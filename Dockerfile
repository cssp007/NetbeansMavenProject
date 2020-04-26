FROM tomcat:8
COPY ./target/CSSP-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
