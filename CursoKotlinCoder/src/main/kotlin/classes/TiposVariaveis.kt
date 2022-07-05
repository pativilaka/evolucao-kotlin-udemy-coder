package classes

val diretamenteNoArquivo = "Bom dia" // constante

fun topLevel(){
    val local = "Fulano!" // estará disponível apenas dentro da função
    println("$diretamenteNoArquivo, $local")
}

class Coisa(){
    var variavelDeInstancia: String = "Boa noite"

    companion object{
        @JvmStatic val constanteDeClasse = "Ciclano" // Não precisamos mais recorrer a este tipo de declaração
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}