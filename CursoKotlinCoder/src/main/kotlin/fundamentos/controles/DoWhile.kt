package fundamentos.controles

fun main(args: Array<String>) {

    var opcao: Int = 0

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voc� escolheu: $opcao")
    } while (opcao != -1)

    println("At� a pr�xima!")
}