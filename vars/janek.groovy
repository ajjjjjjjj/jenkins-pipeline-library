def call(Map config = [:]) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    env.VERSION = ":)"
    echo "VERSION is set to $VERSION"
    node {
        echo "Global variable example, ${config.name}, ${config.env}."
    }
}