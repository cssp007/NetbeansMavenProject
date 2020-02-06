node {
      def mvnHome = tool name: 'maven', type: 'maven'
      def servers = [192.168.1.3:9090]
      
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
   }
