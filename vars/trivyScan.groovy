def call(String image_name) {
    sh "trivy image ${image_name}:${env.BUILD_NUMBER}"
}