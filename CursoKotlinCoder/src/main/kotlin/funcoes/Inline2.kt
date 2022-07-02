package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("M�todo $nomeFuncao inicializado")
    try {
        return funcao()
    } finally {
        println("M�todo $nomeFuncao finalizado")
    }
}

fun somar2(a: Int, b: Int) = a+b

fun main(args: Array<String>) {
    val resultado = executarComLog("Soma"){
        somar2(4, 5) // Lambida
    }

    println(resultado)
}