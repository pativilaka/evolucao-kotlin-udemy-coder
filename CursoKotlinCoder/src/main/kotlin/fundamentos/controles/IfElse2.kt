package fundamentos.controles

fun main(args: Array<String>) {
    val num1: Int = 4
    val num2: Int = 8

   /* val maiorValor = if (num1 > num2){
        println("processando if")
        num1 // esse retorno tem que sempre estar na �ltima linha pois ser� atribuido para a vari�vel
    } else{
        println("validando else")
        num2
    }
    */

    val maiorValor = if(num1 > num2) num1 else num2

    println("O maior valor � $maiorValor")
}
