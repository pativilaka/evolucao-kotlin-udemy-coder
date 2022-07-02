package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray{
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for(n in ordenar(1, 8,4,9,65,48,456,10,15,56,85, a = 1))
        print("$n ")
}