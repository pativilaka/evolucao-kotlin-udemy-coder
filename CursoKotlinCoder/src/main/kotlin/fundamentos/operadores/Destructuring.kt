package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Carro("Ford", "Fusion") // removendo os valores de dentro de um objeto
    println("$marca -- $modelo")

    val (marido, mulher, filho) = listOf("Ale", "Pati", "Ze") // removendo os valores de dentro de um array
    println("$marido, $mulher, $filho")

    val (_, _, terceiroLugar ) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar")
}