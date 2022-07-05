package classes

class Calculadora(){
    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(vararg valoresMult: Int): Calculadora{
        valoresMult.forEach { resultado *= it }
        return this
    }

    fun limpar(): Calculadora{
        resultado = 0
        return this
    }

    fun print(): Calculadora{
        println(resultado)
        return this
    }

    fun obterResultado(): Int{
        return resultado
    }
}


fun main(args: Array<String>) {
    val calculadora = Calculadora()
    calculadora.somar(1,5,9,7,5).print()
    calculadora.somar(1,2,3,8,7).multiplicar(2,6).print().limpar()
    println(calculadora.obterResultado())
}