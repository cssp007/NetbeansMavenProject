pipeline {
    agent any
    
    environment { 
        name = 'Somnat'
        github_URL = 'https://github.com/cssp007/NetbeansMavenProject'
    }
    
    def rootDir = pwd()
    def example = load "${rootDir}@script/cssp.Groovy "
    example.exampleMethod()
    example.otherExampleMethod()
    
    stages {
        
        stage('Getting Code from SCM') {
            steps {
                script {
                    if (env.github_URL == 'https://github.com/cssp007/NetbeansMavenProject') {
                      getCodeFromGithub()
                    }
                    else {
                      echo "github URL is NOT match"
                    }
                    
                        }
                  }
                                        }
        
        stage('Clean Maven') {
           steps {
               script {
                    cleanMaven()
                      }
                 }
        }
        
        stage('Compile Maven') {
            steps {
                script {
                  compileMaven()
                }
            }
        }
        
        stage('Test Maven') {
            steps {
                script {
                  testMaven()
                }
            }
        }
        
        stage('Package Maven') {
            steps {
                script {
                  packageMaven()
                }
            }
        }
        
        stage('Deploy To Tomcat 7') {
            steps {
                script {
                  deployToTomcat()
                }
            }
        }
        
        stage('Calling First Job') {
            steps {
                script {
                  firstJob()
                }
            }
        }
        
      /*  stage('Maven Compile') { 
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
        }*/
    }
}

def firstJob() {
   build 'first-job'
}

def getCodeFromGithub() {
    git env.github_URL
}

def cleanMaven() {
    withMaven(maven : 'maven') {
          sh 'mvn clean'
    }
}

def compileMaven() {
    withMaven(maven : 'maven') {
          sh 'mvn compile'
    }
}

def testMaven() {
    withMaven(maven : 'maven') {
          sh 'mvn test'
    }
}

def packageMaven() {
    withMaven(maven : 'maven') {
          sh 'mvn package'
    }
}

def deployToTomcat() {
    deploy adapters: [tomcat7(credentialsId: 'tomcat', path: '', url: 'http://192.168.1.3:9090')], contextPath: 'test', war: '**/*.war'     
}
