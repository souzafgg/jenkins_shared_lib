def call(String dockerUser, String project, String imageTag){
withCredentials([usernamePassword(credentialsId: 'docker-creds', passwordVariable: 'dockerPassword', usernameVariable: 'dockerUsername')]) {
    sh """
    docker login -u ${dockerUsername} -p ${dockerPassword}
    docker push ${dockerUser}/${project}:${imageTag}
    """
}
}

