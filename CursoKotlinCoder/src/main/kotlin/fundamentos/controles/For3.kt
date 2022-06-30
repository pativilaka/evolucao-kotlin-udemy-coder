package fundamentos.controles

fun main(args: Array<String>) {
    for(i in 0..100 step 5){
        println(i)
    }

    for (i in 100 downTo 1 step 5){
        println(i)
    }
}