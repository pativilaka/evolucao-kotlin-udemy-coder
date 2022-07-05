package classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String = "Generico"){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme("O Poderoso Chefão", 1972, "Drama")
    println("O ${filme.genero} com o título ${filme.nome} foi lançado em ${filme.anoLancamento}")

    val filme2 = Filme("O Casamento do Meu Melhor Amigo", 2005)
    println("O ${filme2.nome} foi lançado em ${filme2.anoLancamento} - ${filme2.genero}")

}