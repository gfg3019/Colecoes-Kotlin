package ferreiragenisson.collection

fun main(){
    val pair:Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)
    map1.forEach { (k , v) -> println("Chave: $k - valor:$v") }

    println(IMPRIMIR)

    val map2 = mapOf(
        "Pedro" to 2500.00,
        "Genisson" to 15000.00
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}