pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Juhi-Lakdawala/jenkins.git'
            }
        }

        stage('Run Java') {
            steps {
                sh 'javac master/Demo.java'
                sh 'java master/Demo'
            }
        }
    }
}