def call(Config map) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Global variable example, ${map.name}."
}