def buildApp() {
    echo "Bulding the app"
}

def TestApp(){
    echo "Testing the app"
}

def DeployApp(){
    echo "Deploying the app"
    echo "deploying version ${params.VERSION}"
}
