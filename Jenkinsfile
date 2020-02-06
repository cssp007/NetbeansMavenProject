node {
      def mvnHome = tool name: 'maven', type: 'maven'
      
      stage("Getting Code from GitHub") {
        git 'https://github.com/cssp007/NetbeansMavenProject.git'
      }
      
      stage("Clean Code") {
        sh "'${mvnHome}/bin/mvn' clean"
      }
      
      stage("Compile Code") {
        sh "'${mvnHome}/bin/mvn' compile"
      }
      
      stage("Test Code") {
        sh "'${mvnHome}/bin/mvn' test"
      }
      
      stage("Package Code") {
        sh "'${mvnHome}/bin/mvn' package"
      }
      
      stage("Stop Tomcat Server") {
        sh '/usr/local/tomcat7/bin/shutdown.sh'
      }
      
      stage("Copy war file to webapps dic") {
        sh 'cp /var/lib/jenkins/workspace/main-pipeline/target/CSSP-1.0-SNAPSHOT.war /usr/local/tomcat7/webapps/'
      }
      
      stage("Start Tomcat Server") {
        sh '/usr/local/tomcat7/bin/startup.sh'
      }
   }
