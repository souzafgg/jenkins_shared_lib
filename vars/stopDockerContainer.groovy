def call(project) {
  sh 'docker stop ${project}'
}