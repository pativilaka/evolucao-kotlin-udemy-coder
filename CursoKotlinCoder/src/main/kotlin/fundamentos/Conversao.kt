package fundamentos

fun main(args: Array<String>) {
    val a = 1

    println( a.toString() + 1 )

    println("1.9".toDouble() + 3)

    println("1".toInt() + 2)

    println("teste".toIntOrNull())
    println("teste".toIntOrNull() ?: 5)
}