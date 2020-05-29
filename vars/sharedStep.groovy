def call(branchName) {
    when {
        branch branchName
    }
    steps {
        script {
            log.info("sharedStep on " + branchName)
        }
    }
}