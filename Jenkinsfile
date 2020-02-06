pipeline {
    agent any
    
    environment { 
        name = 'Somnath'
    }
    
    stages {
        stage('Check git is installed or not') {
            steps {
                environment { 
                name = 'abc'
            }
               script {
                  if (name == "abc") {
                      echo "Hello $name"
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
            echo 'This ran successfully'
              }
        failure {
            echo 'This ran failed'
             }
        unstable {
            echo 'This ran unstable'
             }
        changed {
            echo 'This ran successfully and change'
        }
    }
}
