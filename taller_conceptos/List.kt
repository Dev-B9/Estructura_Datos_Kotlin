fun main() {
    val numeros = mutableListOf<Int>()

    // Llenar la lista con números aleatorios entre 1 y 10
    for (i in 1..10) {
        numeros.add((1..10).random())
    }

    println("Lista original: $numeros")

    // Eliminar todos los elementos impares de la lista
    numeros.removeAll { it % 2 != 0 }

    println("Lista sin números impares: $numeros")

    // Calcular la media de los elementos restantes
    var suma = 0
    for (num in numeros) {
        suma += num
    }
    val media = if (numeros.isNotEmpty()) suma.toDouble() / numeros.size else 0.0

    println("Media de los números restantes: $media")
}