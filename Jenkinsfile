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
    stage{
        script{
            gv.DeployApp()
        }
        }
    }
  }
}
