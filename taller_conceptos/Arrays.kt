fun main() {
    val numeros = Array(10) { (1..100).random() } // Creamos un arreglo de enteros de tamaño 10 con números aleatorios entre 1 y 100
    var ordenado = true // Inicializamos la variable "ordenado" en true

    for (i in 1 until numeros.size) {
        if (numeros[i] < numeros[i-1]) { // Si el elemento actual es menor que el anterior, el arreglo no está ordenado de forma ascendente
            ordenado = false
            break // Detenemos la ejecución del ciclo
        }
    }

    if (ordenado) {
        println("El arreglo está ordenado de forma ascendente.")
    } else {
        println("El arreglo no está ordenado de forma ascendente.")
    }
}