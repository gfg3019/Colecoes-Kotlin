package ferreiragenisson.collection
const val IMPRIMIR:String = "==========================="
fun main(){
    val values = intArrayOf(2, 3, 4, 1, 10, 5, 12, 8)
    values.forEach { valor ->
        println("valor: $valor")
    }
    println(IMPRIMIR)

    values.sort()
    for (i in values){
        println("valor: $i")
    }
}