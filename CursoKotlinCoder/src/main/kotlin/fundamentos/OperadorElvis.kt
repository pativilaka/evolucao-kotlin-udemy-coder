package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
    val obrigatoria: String = opcional ?: "Valor Padr�o"

    println(obrigatoria)
}