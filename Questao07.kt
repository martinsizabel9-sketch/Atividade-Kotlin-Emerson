fun main() {
    val emails: List<String?> = listOf("ana@email.com", null, "", "joao@email.com", null)
    var invalidos = 0
    for (email in emails) {
        if (email.isNullOrEmpty()) {
            invalidos++
            println("Aviso: e-mail nao informado.")
        }
    }
    println("Total de e-mails invalidos: $invalidos")
}
