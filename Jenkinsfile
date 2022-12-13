pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
    }
    
    stages {
        stage('maven package') {
            steps {
                script {
                    sh 'mvn package'
                }
            }
        }
        stage('major service') {
            steps {
                script {
                    sh '''''cd majorservice/
                    docker build -t jongleur6596/majorservice
                    docker push jongleur6596/majorservice
                    docker stop majorservice || true && docker rm majorservice || true
                    docker run -d -p 28080:28080 --name majorservice jongleur6596/majorservice
                    '''''
                }
            }
        }
        stage('student service') {
            steps {
                script {
                    sh '''''cd studentservice/
                    docker build -t jongleur6596/studentservice
                    docker push jongleur6596/studentservice
                    docker stop studentservice || true && docker rm studentservice || true
                    docker run -d -p 28081:28081 --name studentservice jongleur6596/studentservice
                    '''''
                }
            }
        }
    }
}