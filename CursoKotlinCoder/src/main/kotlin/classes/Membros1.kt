package classes

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String = "$dia/$mes/$ano"
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(16,2,1982)

    println(nascimento.formatar())
}