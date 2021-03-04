package ferreiragenisson.collection

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 3
    values[2] = 10
    values[3] = 8
    values[4] = 5
    for (valor in values){
        println(valor)
    }
    println(IMPRIMIR)

    values.forEach {valor ->
        println(valor)
    }
    println(IMPRIMIR)

    for (index in values.indices){
        println(values[index])
    }
    println(IMPRIMIR)
    values.sort()
    for (valor in values){
        println(valor)
    }
}
