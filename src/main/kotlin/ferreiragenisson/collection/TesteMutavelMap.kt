package ferreiragenisson.collection

fun main(){
    val joao = Funcionario("João Alberto", 3000.00, "CLT")
    val pedro = Funcionario("Pedro Ferreira", 5000.00, "PJ")
    val maria = Funcionario("Maria Paula", 2500.00, "CLT")
    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome, maria)


    println(repositorio.findById(maria.nome))

    println(IMPRIMIR)
    repositorio.findAll().forEach{ println(it)}

    println(IMPRIMIR)
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it)}
}