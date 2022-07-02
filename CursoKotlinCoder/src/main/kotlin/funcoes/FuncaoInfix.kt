package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 3.500)
    val p2 = Produto(preco = 2.500, nome = "Tablet")

    println(p2 maisCaroQue p1)
    println(p2.maisCaroQue(p1))
}