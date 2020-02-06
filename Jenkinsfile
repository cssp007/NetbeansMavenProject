pipeline {
    agent any
    stages {
        stage('Check git is installed or not') {
            steps {
                sh 'git --version'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            git 'https://github.com/cssp007/NetbeansMavenProject.git'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }

    stage('Check git is installed or not') { 
        steps {
         def mvnHome = tool name: 'maven', type: 'maven'
        }  
    } 
    post{
       always {
            echo 'Checking for maven..!!'
        }
        success {
            sh "'${mvnHome}/bin/mvn' clean"
            sh "'${mvnHome}/bin/mvn' compile"
            sh "'${mvnHome}/bin/mvn' test"   
            sh "'${mvnHome}/bin/mvn' package"    
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        } 
    
    }
 
}
