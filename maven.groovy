def mavenClean() {
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
return this
