def call(project, dockerUser, imageTag) {
  sh 'docker run -d -p 10000:8080 --name ${project} --rm ${dockerUser}/${project}:${imageTag}'
}