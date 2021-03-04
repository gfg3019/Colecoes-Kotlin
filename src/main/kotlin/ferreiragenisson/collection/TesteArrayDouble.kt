package ferreiragenisson.collection

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1556.45
    salarios[1] = 1000.98
    salarios[2] = 1234.56
    salarios.forEach { println(it) }
    println(IMPRIMIR)
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println(it)
    }

    println(IMPRIMIR)

    val salarios2 = doubleArrayOf(1550.0, 1245.34, 4577.09)
    salarios2.sort()
    salarios2.forEach { println(it) }
}