fun auditarEntregas(enderecos: List<String?>) {
    for (item in enderecos) {
        val endereco = item ?: "Endereço Desconhecido"

        if (endereco == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $endereco")
        }
    }
}

fun main() {
    val enderecos = listOf("Rua A", null, "Rua B", null)
    auditarEntregas(enderecos)
}
