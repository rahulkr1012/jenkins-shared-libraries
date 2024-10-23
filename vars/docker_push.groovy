def call(String Project, String ImageTag, String dockerHubuser){
  withCredentials([usernamePassword(credentialsId: 'ef8e74a3-8165-4f0e-9ab4-53c0b46576b9', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      sh "docker login -u ${dockerHubuser} -p ${dockerHubpass}"
  }
  sh "docker push ${dockerHubuser}/${Project}:${ImageTag}"
}
