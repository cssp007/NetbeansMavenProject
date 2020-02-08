pipeline {
    agent any
    
    environment { 
        name = 'Somnat'
        github_URL = 'https://github.com/cssp007/NetbeansMavenProject'
    }
    
    
    
    stages {       
        
        stage('Getting Code from SCM') {
            steps {
                script {
                   scmCheckOut = load 'git.groovy'  
                   scmCheckOut.getCodeFromGithub() 
                }
            }
         }
        
        stage('Maven steps') {
            steps {
                script {
                   mavenAll = load 'maven.groovy'  
                   mavenAll.mavenClean()
                   mavenAll.compileMaven()
                   mavenAll.testMaven()
                   mavenAll.packageMaven() 
                    
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


def deployToTomcat() {
    echo "Somnath"
    //deploy adapters: [tomcat7(credentialsId: 'tomcat', path: '', url: 'http://192.168.1.3:9090')], contextPath: 'test', war: '**/*.war'     
}
