def call(String dockerUser, String imageTag, String project){
  sh """
   trivy image ${dockerUser}/${project}:${imageTag} > scan.txt
   cat scan.txt
  """
}