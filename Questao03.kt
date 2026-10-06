fun validarBio(bio: String?): Boolean {
    val tamanho = bio?.length ?: 0
    return tamanho <= 50
}
fun main() {
    println(validarBio("Gosto de tecnologia e jogos."))
    println(validarBio(null))
}
