def call() {
    docker.withRegistry('https://registry.hub.docker.com', 'docker-creds')
    dockerapp.push('latest')            
    dockerapp.push("${env.BUILD_ID}")
}