def buildApp() {
    echo "Bulding the app"
}

def testApp(){
    echo "Testing the app"
}

def deployApp(){
    echo "Deploying the app"
    echo "deploying version ${params.VERSION}"
}
