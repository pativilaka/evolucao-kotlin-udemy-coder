package classes

class Cliente{
    var nome: String = " "
}

fun main(args: Array<String>) {
    val cliente = Cliente()
    cliente.nome = "Jony"
    println("O cliente é: ${cliente.nome}")
}