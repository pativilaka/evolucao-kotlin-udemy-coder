package fundamentos.controles

fun main(args: Array<String>) {
    /*
    val alunos = arrayListOf("Andrei", "Maria", "Carla")
    for((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
    */

    val alunos = arrayListOf("Andrei", "Maria", "Carla")
    val materia = arrayListOf("Math", "English", "History")
    var i = 0

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} -- $aluno -- ${materia[i]}")
        i++
    }
}