pipeline{
    agent any
    stages{
        stage('GitCheckOut'){
            steps{
                checkout scm
            }
        }
        stage('Build'){
            tools{
                maven 'Maven 3.6.1'
            }
            steps{
                dir('mavendemo'){
                    bat 'mvn clean install'
                    
                }
            }
        }
                stage('Deploy 2 nexus'){
            tools{
                maven 'Maven 3.6.1'
            }
            steps{
                dir('mavendemo'){
                    bat 'mvn deploy'
                    
                }
            }
        }
    }
}
