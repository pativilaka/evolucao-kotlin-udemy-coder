package funcoes

fun relacaoTrabalho(chefe: String, funcionario: String): String = "$funcionario é subordinado(a) à $chefe"

fun main(args: Array<String>) {
    println(relacaoTrabalho("Maria", "Jonas"))
    println(relacaoTrabalho(funcionario = "Jonas", chefe = "Maria"))
}