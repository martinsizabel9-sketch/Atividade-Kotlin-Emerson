fun main() {
    val entregas: List<String?> = listOf("Entregue", null, "Em rota", null)
    for ((indice, status) in entregas.withIndex()) {
        val resultado = status ?: "Status nao informado"
        println("Entrega ${indice + 1}: $resultado")
    }
}
