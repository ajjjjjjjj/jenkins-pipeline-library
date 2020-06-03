def call() {
    script{
        def lastSuccessfulBuildDescription = 0
        def build = currentBuild.previousBuild
        while (build != null) {
            if (build.result == "SUCCESS")
            {
//                lastSuccessfulBuildID = build.id as Integer
                lastSuccessfulBuildDescription = build.description
                break
            }
            build = build.previousBuild
        }
        println "lastSuccessfulBuildDescription: ${lastSuccessfulBuildDescription}"
        println "previousSuccessfulBuild id: ${currentBuild.previousSuccessfulBuild.id}"
        println "previousSuccessfulBuild desc: ${currentBuild.previousSuccessfulBuild.description}"

        return lastSuccessfulBuildDescription;
    }
}