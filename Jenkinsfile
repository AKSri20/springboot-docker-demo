pipeline {
    agent any
    environment {
        IMAGE_NAME = 'AKSri20/springboot-docker-demo'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/AKSri20/springboot-docker-demo.git'
            }
        }
        stage('Build Docker image') {
            steps{
                sh 'docker build -t sampledockerapp:v1 .'
            }
        }
        stage('Push to Dockerhub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker', userNameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
                sh """
                echo %DOCKER_PASS% |
                docker login -u %DOCKER_USER% --password-stdin
                docker push %IMAGE_NAME%:latest
                docker logout
                """
             }
            }
        }
    
    }
}
