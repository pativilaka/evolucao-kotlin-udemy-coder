package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 4.8

    if (nota >= 7){
        println("Sua nota foi $nota. Parabéns você passou tranquilo!!")
    }else if ((nota >= 5) && (nota < 7)){
        println("Sua nota foi $nota. Você passou mas deve se esforçar mais")
    } else {
        println("Sua nota foi $nota, está de recuperação")
    }
}