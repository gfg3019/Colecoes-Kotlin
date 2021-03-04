package ferreiragenisson.collection

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
){
    override fun toString(): String {
        return """
            ===============================
            Nome: $nome
            Salario: $salario
            Tipo de contratacao: $tipoContratacao
            ================================
        """.trimIndent()
    }
}