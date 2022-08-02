pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.0.0','1.0.1','1.0.2'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    environment {
        username = 'admin'
        myname = 'admin'
    }

stages {
    stage("build"){
    steps{
        echo "building the app"
        echo "Hello ${myname} "
    }
  }
    stage("Test"){
        when {
            expression {
                params.executeTests
            }
        }
        steps {
            echo 'testing the application'
        }
  }

    stage("deploy"){
        stage{
            echo "deploying the application"
            echo " deploying version ${params.VERSION}"
        }
    }

 }
}
