podTemplate(label: 'builder',
            containers: [
                containerTemplate(name: 'gradle', image: 'gradle:5.6-jdk8', command: 'cat', ttyEnabled: true)
            ]) {
    node('builder') {
        stage('Build') {
            container('gradle') {
                sh "echo pipeline test"
            }
        }
    }
}