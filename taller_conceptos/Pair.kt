fun main() {
    // Crea una lista de palabras
    val palabras = listOf("hola", "mundo", "programación", "kotlin", "lista")

    // Crea una lista vacía de pares de cadenas y enteros
    val pares = mutableListOf<Pair<String, Int>>()

    // Recorre la lista "palabras" y para cada palabra, crea un par que contenga la palabra y su longitud
    for (palabra in palabras) {
        val longitud = palabra.length
        val par = Pair(palabra, longitud)
        pares.add(par)
    }

    // Imprime los pares almacenados en la lista "pares"
    for (par in pares) {
        println("${par.first} - ${par.second}")
    }
}