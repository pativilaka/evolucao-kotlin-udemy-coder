package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    kotlin.io.println("O texto que eu quero mostrar � ${funcaoSimples("Ol�, Mundo!")}")

    val coisa = Coisa("ol�") // Instanciando objeto do tipo Coisa
    println(coisa.nome)

    println(CARA)

    println("Os valores num�ricos s�o: ${fundamentos.pacoteB.soma(5,20)} e ${subtracao(10,45)}")
}

