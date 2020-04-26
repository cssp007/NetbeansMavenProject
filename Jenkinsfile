pipeline {
    agent any
    
    environment { 
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
        
        stage('Creating Tomcat docker images') {
            steps {
                script {
                    sh "docker build -t cssp007143/custom-image ."
                }
            }
        }
	    
	
	stage('Push tomcat image to Docker Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'DOCKER_HUB_PASS', variable: 'DOCKER_HUB_PASS')]) {
                    sh "docker login -u cssp007143 -p $DOCKER_HUB_PASS"
                }
	            sh "docker push cssp007143/custom-image"
                }
            }
        }
        
        
        stage('Deploy Application in K8s Cluster') {
            steps {
                script {
                   kubernetesDeploy(
				      configs: 'tomcat.yaml',
				      kubeconfigId: 'KUBERNETES_CONFIG'
				   ) 
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

