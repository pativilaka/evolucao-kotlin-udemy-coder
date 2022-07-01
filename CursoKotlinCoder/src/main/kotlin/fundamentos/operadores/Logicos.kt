package fundamentos.operadores

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = false
    val executouTrabalho2: Boolean = false

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    // Operador Un�rio
    if (!comprouSorvete){
        println("Sua sa�de agradece")
    }
}