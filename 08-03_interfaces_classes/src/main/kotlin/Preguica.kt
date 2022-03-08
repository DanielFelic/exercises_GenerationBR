class Preguica (override val nome: String, override val idade: Int) : Animal {
    override fun emitirSom() {
        println("socorro!".uppercase())
        println("socorro!".uppercase())
        println("socorro!".uppercase())
    }
    fun subir(){
        println("O Bicho-preguiça está subindo na árvore.")
    }
}