package fundamentos.controles

fun main(args: Array<String>) {
    val nota = 7


    when (nota) {
        9,10 -> println("Fant�stico")
        7,8 -> println("Parab�ns")
        in 4..6 -> println("Tem como recuperar")
        in 0..3 -> println("Te vejo no pr�ximo ano")
        else -> println("Nota inv�lida")
    }
}