package classes

class Filme2(val nome: String, val anoDeLancamento: Int, val genero: String = "Generico" )

fun main(args: Array<String>) {
    val filme = Filme2("Monstros SA", 2001, "Comédia")
    val filme2 = Filme2("Esqueceram de Mim", 1992)

    println("O filme ${filme.nome} foi lançado em ${filme.anoDeLancamento} - ${filme.genero}")

    println("O filme ${filme2.nome} foi lançado em ${filme2.anoDeLancamento} - ${filme2.genero}")
}