pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/priyadharshini526/maven.git'
            }
        }

        stage('Maven Build') {
            steps {
                bat 'mvnd clean package'
            }
        }

        stage('Run Application') {
            steps {
                bat 'java -jar target\\demo-1.0-SNAPSHOT.jar'
            }
        }
    }
}
