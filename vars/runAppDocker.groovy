def call(String project, String dockerUser, String imageTag) {
  sh "docker run -d --rm -p 8081:8081 --name ${project} ${dockerUser}/${project}:${imageTag}"
}