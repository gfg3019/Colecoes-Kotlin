package ferreiragenisson.collection

fun main(){
    val joao = Funcionario("João Alberto", 3000.00, "CLT")
    val pedro = Funcionario("Pedro Ferreira", 5000.00, "PJ")
    val maria = Funcionario("Maria Paula", 2500.00, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    println("=====================LIST=======================")
    funcionarios.forEach { println(it) }

    println(IMPRIMIR)
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println(IMPRIMIR)
    funcionarios.remove(maria)
    funcionarios.forEach { println(it) }

    println("=====================SET=======================")
    val funcionariosSet = mutableSetOf(joao)
    //funcionariosSet.forEach { println(it) }

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println(IMPRIMIR)

    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }

}