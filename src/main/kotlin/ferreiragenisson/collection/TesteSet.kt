package ferreiragenisson.collection

fun main(){
    val joao = Funcionario("João Alberto", 3000.00, "CLT")
    val predo = Funcionario("Pedro Ferreira", 5000.00, "PJ")
    val maria = Funcionario("Maria Paula", 2500.00, "CLT")
    val funcionarios1 = setOf(joao, predo)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println(IMPRIMIR)

    val funcionarios3 = setOf(joao, predo, maria)
    val resultSubtrack = funcionarios3.subtract(funcionario2)
    resultSubtrack.forEach { println(it) }

    println(IMPRIMIR)
    println(IMPRIMIR)

    val resultIntersect = funcionarios3.intersect(funcionario2)
    resultSubtrack.forEach { println(it) }
}