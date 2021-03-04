package ferreiragenisson.collection

fun main(){
    val joao = Funcionario("João Alberto", 3000.00, "CLT")
    val predo = Funcionario("Pedro Ferreira", 5000.00, "PJ")
    val maria = Funcionario("Maria Paula", 2500.00, "CLT")
    val  funcionarios = listOf(joao, predo, maria)

    funcionarios.forEach{ println(it)}
    println(IMPRIMIR)
    println(funcionarios.find { it.nome == "Maria Paula" })

    println(IMPRIMIR)

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
    println(IMPRIMIR)
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it)}
}
