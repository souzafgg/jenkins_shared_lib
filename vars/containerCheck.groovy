def call(appName) {
  sh 'if [ -z "$(docker ps -q -f name=${appName})" ]; then echo "Nada a remover"; else docker stop ${appName}; fi'
}