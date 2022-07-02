package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Método $nomeFuncao inicializado")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado")
    }
}

fun somar2(a: Int, b: Int) = a+b

fun main(args: Array<String>) {
    val resultado = executarComLog("Soma"){
        somar2(4, 5) // Lambida
    }

    println(resultado)
}