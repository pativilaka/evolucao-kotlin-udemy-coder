package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 4.8

    if (nota >= 7){
        println("Sua nota foi $nota. Parab�ns voc� passou tranquilo!!")
    }else if ((nota >= 5) && (nota < 7)){
        println("Sua nota foi $nota. Voc� passou mas deve se esfor�ar mais")
    } else {
        println("Sua nota foi $nota, est� de recupera��o")
    }
}