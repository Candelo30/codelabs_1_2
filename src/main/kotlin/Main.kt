package org.example

fun main() {

    // variable
    val num: Int  = -0
    println("Codelab #1\n")


    println("Conditions")
    println("if\n")

    if (num <= 17) {
        println("No puedes ingresar")
    }

    println("\n if else \n")
    if (num <= 0) {
        println("Edad fuera de los rangos")
    }else if(num < 17) {
        println("Eres menor de edad")
    }else {
        println("Puedes ingresar")
    }

    println("\n When \n")

    val operation = "suma"

    fun suma () {
        println("Has llamado a la suma")
    }

    fun resta () {
        println("Has llamado a la resta")
    }

    fun multiplicacion () {
        println("Has llamado a la multiplicación")
    }

    fun divicion () {
        println("Has llamado a la divicion")
    }

    when (operation) {
        "Suma" -> suma()
        "Resta" -> resta()
        "Multiplicacion" -> multiplicacion()
        "Divicion" -> divicion()
        else -> print("Operación no valida")
    }

    val n = 2
    when (n){
        2,4,6,8 -> println("Es par")
        in 1.. 10 -> println("Es impar")
        else -> println("No se haya el resultado")
    }
}