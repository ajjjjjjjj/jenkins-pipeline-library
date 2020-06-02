def call() {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    script {
        echo "Env: ${DB_ENGINE}, def: ${DISABLE_AUTH}, Global variable example. ${VERSION}"
    }
}