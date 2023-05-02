def call(String dockerUser, String project, String imageTag){
  sh """
   trivy image ${dockerUser}/${project}:${imageTag} > scan.txt
   cat scan.txt
  """
}