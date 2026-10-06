fun avaliarMotorista(nota: Int?): String {
    val n = nota ?: return "Sem avaliacao"
    return when (n) {
        in 0..4 -> "Ruim"
        in 5..7 -> "Regular"
        in 8..10 -> "Otimo"
        else -> "Nota invalida"
    }
}
fun main() {
    println(avaliarMotorista(9))
    println(avaliarMotorista(null))
}
