pipeline{
    agent any
    stages{
        stage('GitCheckOut trigger'){
            steps{
                checkout([$class: 'GitSCM', 
                branches: [[name: '*/master']], 
                doGenerateSubmoduleConfigurations: false, 
                extensions: [], 
                submoduleCfg: [], 
                userRemoteConfigs: 
                [[url: 'https://github.com/keertisurapaneni/maven-nexus-zen.git']]])
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
                stage('Deploy to nexus'){
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
