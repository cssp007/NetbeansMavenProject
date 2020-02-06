pipeline {
    agent any
    
    environment { 
        name = 'Somnat'
    }
    
    stages {
        
        stage('Looping in jenkinsfile') {
            steps {
                script {
                  def numbers = ['a','b','c','d','e']
                    for(number in numbers) {
                       echo number
                    }
                }
            }
        }
        
        stage('Check git is installed or not') {
           steps {
               script {
                  if (env.name == "Somnath") {
                      echo "Working"
                                             }
                   else {
                        echo "Again working"
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
