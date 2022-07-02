package funcoes

fun imprimeMiorValor1(a: Int, b: Int){
    println(Math.max(a, b))
}


fun imprimeMiorValor2(a: Int, b: Int): Unit{
    println(Math.max(a, b))
}


fun imprimeMiorValor3(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return
}


fun imprimeMiorValor4(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return Unit
}


fun imprimeMiorValor5(a: Int, b: Int){
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimeMiorValor1(2,1)
    imprimeMiorValor2(2,1)
    imprimeMiorValor3(2,1)
    imprimeMiorValor4(2,1)
    imprimeMiorValor5(2,1).run { 2 > 1 }.run { println("Imprime resultado = $this") }
}