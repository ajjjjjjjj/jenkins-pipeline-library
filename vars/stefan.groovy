def call(script, name) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Env: ${script.env.DB_ENGINE}, Global variable example, ${name}."
}