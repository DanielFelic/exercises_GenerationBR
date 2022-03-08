class Cachorro (override val nome: String, override val idade: Int) : Animal {

    override fun emitirSom() {
        println("auauauauau!".uppercase())
        println("auauauauau!".uppercase())
        println("auauauauau!".uppercase())
    }

    fun correr(){
        println("Cachorro está correndo.")
    }

}