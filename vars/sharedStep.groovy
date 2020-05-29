def call(branchName) {
    node {
        when {
            branch branchName
        }
        steps {
            script {
                log.info("sharedStep on " + branchName)
            }
        }
    }
}