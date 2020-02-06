pipeline{
    agent any
    environment{
        MY_FILE = fileExists '/tmp/myfile'
    }
    stages{
        stage("File is exists"){
            when { expression { MY_FILE == 'true' } }
            fileIsExists()
        }
        
        stage("File is NOT exists"){
            when { expression { MY_FILE == 'true' } }
                fileIsNotExists()
        }
        
        
        
        }

def fileIsExists() {
       steps {
                echo "file exists"
            }
         }
    
def fileIsNotExists() {
    steps {
                echo "file does not exist"
        }
}
