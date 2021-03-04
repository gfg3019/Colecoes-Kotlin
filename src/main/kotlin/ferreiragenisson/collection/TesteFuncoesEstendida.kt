package ferreiragenisson.collection

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "4500".toBigDecimal(),
        "1500".toBigDecimal()
    )
    println(IMPRIMIR)
    println("somatoria: ${salarios.somatoria()}")
    println(IMPRIMIR)
    println("Media: ${salarios.media()}")
}