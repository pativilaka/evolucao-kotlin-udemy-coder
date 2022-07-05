package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get() = !ativo
    val precoDesconto: Double get() = preco * (1-desconto)
}

fun main(args: Array<String>) {
    val prod1 = Produto("iPad", 2349.90,0.20, ativo = true)
    println(prod1.precoDesconto)

    val prod2 = Produto("Galaxy Note 7", 2699.49, 0.50, ativo = true)
    if (prod2.inativo){
        prod2.preco = 0.0
        println("Depois de inativo: R$ ${prod2.precoDesconto}")
    } else{
        println("${prod2.nome} \n\t De: R$ ${prod2.preco} \n\t Por: R$ ${prod2.precoDesconto}")
    }

}