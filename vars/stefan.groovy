def call(name) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Env: ${DB_ENGINE}, def: ${DISABLE_AUTH}, Global variable example, ${name}."
}