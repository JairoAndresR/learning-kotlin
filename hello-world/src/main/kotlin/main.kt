// Constante
// En tiempo de compilacion
const val PI = 3.1416
fun main(args: Array<String>) {
    // Variables
    // En tiempo de ejecución

    // var "nombre" : "tipo" = "valor"
    var dinero : Int = 10
    // var "nombre" = "valor"
    var dinero2 = 10

    println(dinero)
    dinero = 5
    println(dinero)

    // Variable de lectura (val) ->  no se puede cambiar
    val nombre = "Maria"
    println(nombre)
    println(PI)

    // Tipos de variable
    val bool : Boolean = true
    val longNumber : Long = 3L
    val puntoFlotante : Double = 2.4
    val flotante : Float = 1.1F

    // Template para cadenas de texto
    val primerNombre = "Andres"
    val apellido = "Romero"
    val nombreCompleto = primerNombre + " " + apellido
    val nombreCompletoTemplate = "$primerNombre $apellido"
    println(nombreCompletoTemplate)

    val valor1 = 10
    val valor2 = 50
    val val3 = valor2.minus(valor1)
    println(val3)

}