package fundamentos

fun main(args: Array<String>) {
    // Tipos Numéricos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807

    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)

    //Tipos Numéricos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    // Tipo Caractere
    val char: Char = '?' // Outros exemplos... '1', 'g', ' '

    // Tipo Booleano
    val boolean: Boolean = true // ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(3 is Int) // se inserirmos (3 is Byte) sistema apresenta erro de tipo - iforma que nº é do tipo Int
    println(1.0 is Double)
    println(21417483648 is Long)

    // Tudo é objeto
    println(10.dec())
    println(9.dec())
}
