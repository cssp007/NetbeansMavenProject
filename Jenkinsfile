pipeline {
    agent any
    stages {
        stage('Check git is installed or not') {
            steps {
               script {
                  def name = "Somnath"
                  if (${name} == "Somnath") {
                      echo "Hello ${name}"
                                            }
                      }
                 }
                                               }
        
        stage('Maven Compile') { 
           steps {
              //def mvnHome = tool name: 'maven', type: 'maven'
              withMaven(maven : 'maven') {
                  sh 'mvn clean compile'
                                         }
                 }  
                               } 
        
        stage('Maven Package') { 
           steps {
              //def mvnHome = tool name: 'maven', type: 'maven'
              withMaven(maven : 'maven') {
                  sh 'mvn package'
                                         }
                 }  
                               } 
        
           }
    post {
        always {
            echo 'This will always run'
        }
        success {
            mail bcc: '', body: '''Hello Somnath,

            Your code ran successfully. 

            Cheers''', cc: '', from: 'pandey.somnath007@gmail.com', replyTo: '', subject: 'Build status', to: 'pandey.somnath007@gmail.com'
        }
        failure {
            mail bcc: '', body: '''Hello Somnath,

            Your code is failed.Please check and resovled the issue.

            Cheers''', cc: '', from: 'pandey.somnath007@gmail.com', replyTo: '', subject: 'Build status', to: 'pandey.somnath007@gmail.com'
        }
        unstable {
            mail bcc: '', body: '''Hello Somnath,

            Your code unstable. 

            Cheers''', cc: '', from: 'pandey.somnath007@gmail.com', replyTo: '', subject: 'Build status', to: 'pandey.somnath007@gmail.com'
        }
        changed {
            mail bcc: '', body: '''Hello Somnath,

            Your code ran successfully now. 

            Cheers''', cc: '', from: 'pandey.somnath007@gmail.com', replyTo: '', subject: 'Build status', to: 'pandey.somnath007@gmail.com'
        }
    }
}
