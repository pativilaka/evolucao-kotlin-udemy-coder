package fundamentos

fun main(args: Array<String>) {

    val a: Int = 33.dec()
    val b: String = a.toString()

    println("Int $a")
    println("O primeiro char da String � ${b.last()}")
}