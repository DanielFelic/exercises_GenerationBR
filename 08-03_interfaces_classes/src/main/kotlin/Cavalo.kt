class Cavalo (override val nome: String, override val idade: Int) : Animal {
    override fun emitirSom() {
        println("iiirrrrí!".uppercase())
        println("iiirrrrí!".uppercase())
        println("iiirrrrí!".uppercase())
    }

    fun correr(){
        println("Cavalo está correndo.")
    }
}