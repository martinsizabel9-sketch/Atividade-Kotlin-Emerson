fun main() {
    val tratarValor: (Double?) -> Double = { valor ->
        if (valor == null || valor < 0) 0.0 else valor
    }
    println(tratarValor(25.5))
    println(tratarValor(-4.0))
    println(tratarValor(null))
}
