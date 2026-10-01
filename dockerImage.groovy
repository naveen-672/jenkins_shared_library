def call(string image_name) {
    sh "docker build -t ${image_name}:${env.BUILD_NUMBER} ."
}