package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 8.9

    // Usando operador range

    if (nota in 9.0..10.0){
        println("Passou com mérito")
    }else if (nota in 7.0..8.9){
        println("Parabéns!")
    }else if (nota in 4.0..6.9){
        println("Tem como recuperar")
    }else if (nota in 0.0..3.9){
        println("Te vejo no próximo ano!")
    } else{
        println("Nota inválida")
    }

    println(5 in 7..4) // forma errada de validação
    println(5 in 4..7)
}