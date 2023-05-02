def call(String dockerUser, String imageTag, String project){
  sh """
  docker build -t ${dockerUser}/${project}:${imageTag} .
  echo ${dockerUser}/${project}:${imageTag}
  """
}