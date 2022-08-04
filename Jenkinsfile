#!/usr/bin/env groovy

pipeline {
    agent none
    stages {
        stage('test') {
            when {
                expression{
                BRANCH_NAME == 'master'
                }
                }
            steps {
            script {
                echo "Testing the application..."
                }
              }
            }
        stage('build') {
            when {
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                script {
                    echo "Building the application..."
                }
            }
          }

        stage('deploy') {
             when {
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}


/*def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.0.0','1.0.1','1.0.2'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

/*
    environment {
        username = 'admin'
        myname = 'admin'
    }
*/

stages {

    stage("init"){
        steps{
            script{
            gv = load "script.groovy"
                }
            }
        }


    stage("build"){
        steps{
        script {
                gv.buildApp()
            }
            }
        }

    stage("Test"){
        when {
            expression {
                params.executeTests
                }
            }
        steps {
            script{   
            gv.TestApp()          
            }
        }
        }

    stage("deploy"){
        input {
            message "select the env to deploy"
            ok "Done"
            parameters {
                    choice(name: 'Env', choices: ['Dev','Stage','Prod'], description: '')
            }
        }
        steps{
            script{
                gv.DeployApp()
                echo "Deploying to ${Env}"
            }
            }
        }
  }
}
*/
