pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk17'
    }
    stages {
        stage ('Initialize') {
            steps {
                echo 'toto';
                sh 'mvn test'
            }
        }
    }
    
}
