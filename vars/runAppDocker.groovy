def call(String project, String dockerUser, String imageTag) {
  sh 'docker run -d --rm -p 10000:8080 --name ${project} ${dockerUser}/${project}:${imageTag}'
}