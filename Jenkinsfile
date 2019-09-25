pipeline {
    agent any

    stages {

        stage('Deploy') {
            steps {
                sh "cd src/main/java/com/qa/"
                sh "sudo mvn spring-boot:run"
            }
        }
    }
}