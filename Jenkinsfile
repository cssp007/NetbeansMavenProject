node {
            
      get_git_repo()
      maven_run()
      tomcat()
      
     /* stage("Getting Code from GitHub") {
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
      
     /* stage("Stop Tomcat Server") {
        sh "'ssh root@192.168.1.3' /usr/local/tomcat7/bin/shutdown.sh"
      }
      
      stage("Copy war file to webapps dic") {
        sh 'cp /var/lib/jenkins/workspace/main-pipeline/target/CSSP-1.0-SNAPSHOT.war /usr/local/tomcat7/webapps/'
      }
      
      /*stage("Start Tomcat Server") {
        sh '/usr/local/tomcat7/bin/startup.sh'
      }*/
   }

def get_git_repo() {
  stage("Getting Code from GitHub") {
        git 'https://github.com/cssp007/NetbeansMavenProject.git'
      }
}

def maven_run() {
      def mvnHome = tool name: 'maven', type: 'maven'
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
}

def tomcat() {
  stage("Copy war file to webapps dic") {
        sh 'cp /var/lib/jenkins/workspace/main-pipeline/target/CSSP-1.0-SNAPSHOT.war /usr/local/tomcat7/webapps/'
      }
}
