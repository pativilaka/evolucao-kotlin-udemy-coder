package fundamentos.controles

fun main(args: Array<String>) {
    var opcao: Int = 0

    while (opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Voc� digitou o n�mero $opcao")
    }

    println("At� a pr�xima")
}