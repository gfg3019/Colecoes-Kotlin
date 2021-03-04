package ferreiragenisson.collection

fun main(){
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Jurubeba"
    nomes[2] = "Wiliw"
    for (nome in nomes){
        println(nome)
    }
    println(IMPRIMIR)
    nomes.sort()
    nomes.forEach { println(it) }

    println(IMPRIMIR)
    val nomes2 = arrayOf("jurema", "Guanabara", "Rose")
    nomes2.sort()
    nomes2.forEach { println(it) }
}
