fun main() {
    val valores: List<Double?> = listOf(50.0, null, 120.5, null, 10.0)
    var total = 0.0
    for (valor in valores) {
        if (valor != null) total += valor
    }
    println("Total: R$ $total")
}
