def call(String image_name  ) {
withDockerRegistry(credentialsId: 'dockerhub-cred') {
    sh "docker push ${image_name}:${env.BUILD_NUMBER}"
    }
}