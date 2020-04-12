# Centos based container with Java and Tomcat
FROM centos:7

# Install prepare infrastructure
RUN yum update -y && yum install -y epel-release java-1.8.0-openjdk-devel wget tar

# Prepare environment 
ENV JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.232.b09-0.el7_7.x86_64
ENV PATH=$PATH:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.232.b09-0.el7_7.x86_64/bin
ENV CATALINA_HOME=/opt/tomcat 
ENV PATH=$PATH:$JAVA_HOME/bin:$CATALINA_HOME/bin:$CATALINA_HOME/scripts


# Install Tomcat
ENV TOMCAT_MAJOR 8
ENV TOMCAT_VERSION 8.5.47

RUN wget http://mirrors.estointernet.in/apache/tomcat/tomcat-8/v8.5.47/bin/apache-tomcat-8.5.47.tar.gz && \
 tar -xvf apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
 rm apache-tomcat*.tar.gz && \
 mv apache-tomcat* ${CATALINA_HOME}

RUN groupadd -r tomcat && \
 useradd -g tomcat -d ${CATALINA_HOME} -s /sbin/nologin  -c "Tomcat user" tomcat && \
 chown -R tomcat:tomcat ${CATALINA_HOME}



RUN chmod +x ${CATALINA_HOME}/bin/*sh

CMD /opt/tomcat/bin/catalina.sh run && tail -f /opt/tomcat/logs/catalina.out

WORKDIR /opt/tomcat

EXPOSE 8080
EXPOSE 8009
EXPOSE 8090
