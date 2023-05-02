def call(String dockerUser, String project, String imageTag){
  sh """
  docker build -t ${dockerUser}/${project}:${imageTag} .
  echo ${dockerUser}/${project}:${imageTag}
  """
}