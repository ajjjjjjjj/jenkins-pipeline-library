def call() {
    script{
        def lastSuccessfulBuildID = 0
        def build = currentBuild.previousSuccessfulBuild
        while (build != null) {
            if (build.result == "SUCCESS")
            {
                lastSuccessfulBuildID = build.id as Integer
                lastSuccessfulBuildDescription = build.description
                break
            }
            build = build.previousBuild
        }
        println "previousSuccessfulBuild id: ${currentBuild.previousSuccessfulBuild.id}"
        println "previousSuccessfulBuild desc: ${currentBuild.previousSuccessfulBuild.description}"
    }
}