fun main() {
    // Paso 1: Crear el mapa de palabras y traducciones
    val diccionario = mapOf(
        "hello" to "hola",
        "goodbye" to "adiós",
        "cat" to "gato",
        "dog" to "perro",
        "bird" to "pájaro"
    )

    // Paso 2: Pedir al usuario que ingrese una palabra a buscar
    print("Ingresa una palabra a buscar: ")
    val palabra = readLine()

    // Paso 3: Recorrer el mapa y buscar la traducción de la palabra
    var traduccion: String? = null 
    for ((clave, valor) in diccionario) {
        if (clave == palabra) {
            traduccion = valor
            break // 
        }
    }

    // Paso 4: Imprimir la traducción o un mensaje indicando que la palabra no se encuentra en el diccionario
    if (traduccion != null) {
        println("La traducción de \"$palabra\" es \"$traduccion\".")
    } else {
        println("La palabra \"$palabra\" no se encuentra en el diccionario.")
    }
}