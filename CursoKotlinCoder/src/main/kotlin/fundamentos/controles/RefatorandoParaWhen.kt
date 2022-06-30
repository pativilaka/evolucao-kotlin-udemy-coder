package fundamentos.controles

fun main(args: Array<String>) {
    val nota = 7


    when (nota) {
        9,10 -> println("Fantástico")
        7,8 -> println("Parabéns")
        in 4..6 -> println("Tem como recuperar")
        in 0..3 -> println("Te vejo no próximo ano")
        else -> println("Nota inválida")
    }
}