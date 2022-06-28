package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null

    println(a?.inc())

    println("Momento do erro")
    //println(a!!.inc()) // Quer dizer que estou ciente do que está sendo feito
}