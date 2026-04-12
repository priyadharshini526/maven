pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/priyadharshini526/maven.git'
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t maven-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8080:8080 --name maven-container maven-app'
            }
        }
    }
}
