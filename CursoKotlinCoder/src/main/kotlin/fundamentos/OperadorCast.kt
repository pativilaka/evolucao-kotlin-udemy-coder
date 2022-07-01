package fundamentos

fun imprimeConceito(x: Any){
    when(x as? Int){
        10, 9 -> println("Conceito A")
        8, 7 -> println("Conceito B")
        6, 5 -> println("Conceito C")
        4, 3 -> println("Conceito D")
        2, 1, 0 -> println("Conceito E")
        else -> println("Nota inválida")
    }
}

fun main(args: Array<String>) {
   val notas = arrayOf(9.5, 8.4, 3.1, 4.6)
   for (nota in notas){
       imprimeConceito(nota.toInt())
   }
}