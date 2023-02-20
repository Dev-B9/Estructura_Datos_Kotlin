fun main(){
    val palabras = listOf("hola", "adiós", "casa", "perro", "gato", "corazón")
    val palabrasConLetra = mutableSetOf<String>()

    print("Ingresa una letra: ")
    val letra = readLine() ?: ""

//función "startsWith()" de Kotlin para verificar si cada palabra comienza con la letra ingresada por el usuario
    for (palabra in palabras) {
        if (palabra.startsWith(letra)) {
        palabrasConLetra.add(palabra)
    }
    }
    println("Las palabras que empiezan con la letra $letra son:")

    for (palabra in palabrasConLetra) {
    println(palabra)
    }
    
}