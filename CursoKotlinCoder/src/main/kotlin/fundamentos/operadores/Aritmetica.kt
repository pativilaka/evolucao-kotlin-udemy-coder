package fundamentos.operadores

fun main(args: Array<String>) {
    val (v1, v2, v3, v4) = listOf(2, 8, 9, 1)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v3 - v2
    val multiplicacao = v1 * v2
    val divisao = v2 / v1
    val modulo = v2 % 2

    println("$soma, $subtracao, $multiplicacao, $divisao, $modulo")
}