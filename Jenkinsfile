pipeline {
    agent any
    
    tools {
        maven "Maven"
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    def scmVars = checkout([
                        $class: 'GitSCM',
                        branches:[[name: '*/main']],
                        userRemoteConfigs: [[url: 'https://github.com/Juhi-Lakdawala/maven.git']]
                        ])
                }
            }
        }

        stage('Clean') {
            steps {
                // Clean the project with a custom pom.xml
                bat 'mvn clean -f First_Maven_Project/pom.xml'
            }
        }

        stage('Build') {
            steps {
                // Build the Maven project with a custom pom.xml
                bat 'mvn package -f First_Maven_Project/pom.xml'
            }
        }

        stage('Test') {
            steps {
                // Run tests here (e.g., JUnit tests) with a custom pom.xml
                bat 'mvn test -f First_Maven_Project/pom.xml'
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully!"
        }
        failure {
            echo "Pipeline failed. Please check the build and test stages."
        }
    }
}
