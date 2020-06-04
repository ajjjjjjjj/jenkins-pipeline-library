def call(version) {
    log.info("runE2ETests, version" + version)

    stages {
        stage('docker pull') {
            steps {
                echo 'Docker pull...'
            }
        }
        stage('run e2e') {
            steps {
                echo 'run e2e...'
            }
        }
    }
}