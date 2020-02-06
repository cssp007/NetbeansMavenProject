pipeline{
    agent any
    environment{
        MY_FILE = fileExists '/tmp/myfile'
    }
    stages{
        stage("File is exists"){
            when { expression { MY_FILE == 'true' } }
            steps {
                fileIsExists()
            }
        }
        
        stage("File is NOT exists"){
            when { expression { MY_FILE == 'true' } }
            steps {
                fileIsNotExists()
            }
        }
        
        
        
        }

def fileIsExists() {
                echo "file exists"
            }
    
def fileIsNotExists() {
                echo "file does not exist"
        }
