fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor * 0.90
        "PROMO20" -> valor * 0.80
        else -> valor
    }
}

fun main() {
    println(calcularDesconto(100.0, "PROMO10"))
    println(calcularDesconto(100.0, "PROMO20"))
    println(calcularDesconto(100.0, null))
}
