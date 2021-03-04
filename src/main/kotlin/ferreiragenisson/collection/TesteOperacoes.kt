package ferreiragenisson.collection

fun main(){
    val salarios = doubleArrayOf(1000.23, 1245.34, 8676.34)

    for (salario in salarios){
        println(salario)
    }
    println(IMPRIMIR)

    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Maior Salario: ${salarios.minOrNull()}")
    println("Média Salario: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    println(IMPRIMIR)
    salarioMaiorQue2500.forEach{ println(it)}
    println(IMPRIMIR)
    println(salarios.count{it in 2000.0..9000.0})
    println(IMPRIMIR)
    println(salarios.find { it == 1000.23 })
    println(salarios.find { it == 500.0 })
    println(IMPRIMIR)
    println(salarios.any{it == 1245.34})
    println(salarios.any { it == 500.0 })
}

