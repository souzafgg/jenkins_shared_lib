def call(String dockerUser, String imageTag, String project){
withCredentials([usernamePassword(credentialsId: 'docker-creds', passwordVariable: 'dockerPassword', usernameVariable: 'dockerUsername')]) {
    sh """
    docker login -u ${dockerUsername} -p ${dockerPassword}
    docker push ${dockerUser}/${project}:${imageTag}
    """
}
}

