package fundamentos.operadores

fun calculo(nota: Double): String = if(nota >= 7) "Aprovado" else "Reprovado"

fun main(args: Array<String>) {
    println("${calculo(8.8)}")
}