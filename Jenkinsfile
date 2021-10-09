podTemplate(label: 'builder',
            containers: [
                containerTemplate(name: 'gradle', image: 'gradle:5.6-jdk8', command: 'cat', ttyEnabled: true),
                ports: [
                	portMapping(name: 'gradle1', containerPort: 8080, hostPort: 8080)
                ]
            ]) {
    node('builder') {
        stage('Build') {
            container('gradle') {
                sh "echo pipeline test"
            }
        }
    }
}