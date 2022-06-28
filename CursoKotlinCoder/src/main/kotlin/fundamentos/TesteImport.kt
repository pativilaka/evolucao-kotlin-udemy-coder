package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    kotlin.io.println("O texto que eu quero mostrar é ${funcaoSimples("Olá, Mundo!")}")

    val coisa = Coisa("olà") // Instanciando objeto do tipo Coisa
    println(coisa.nome)

    println(CARA)

    println("Os valores numéricos são: ${fundamentos.pacoteB.soma(5,20)} e ${subtracao(10,45)}")
}

