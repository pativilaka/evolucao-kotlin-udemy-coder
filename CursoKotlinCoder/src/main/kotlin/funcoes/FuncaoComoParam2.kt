package funcoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List <E> {
    val listaFiltrada = ArrayList<E>()
    for (e in lista){
        if(filtro(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String) = nome.length == 3

fun main(args: Array<String>) {
    val nomes = listOf("Ana", "Juliana", "Ken", "Gui", "Luana", "Pat", "Luana", "Alexandre", "Ale" )
    println(filtrar(nomes, ::comTresLetras))
}