/* Autor: Daniel Feliciano

1 - Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
as características de forma que tudo o que for comum a todos os animais fique
na classe Animal:

CACHORRO: Nome, Idade, Som, Correr | CAVALO: Nome, Idade, Som, Correr
| BICHO-PREGUIÇA: Nome, Idade, Som, Subir

2 - Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.

*/

fun main() {

    val quinta = Cachorro("Quinta-feira", 15)
    val spirit = Cavalo("Spirit", 20)
    val judite = Preguica("Judite", 50)

    while (true) {

        println("\nSELECIONE O ANIMAL\n")

        println("1 - Cachorro")
        println("2 - Cavalo")
        println("3 - Bicho-preguiça")
        println("Digite outro valor para sair")

        var opc = 0

        while (true) {
            println("\nDigite a opção desejada: ")

            try {
                opc = readLine()!!.toInt()
                break
            } catch (e: Exception) {
                println("Valor inválido!")
            }
        }

        when (opc) {

            1 -> {
                println("Escolha a ação do animal: ")
                println("1 - Emitir som")
                println("2 - Movimentar-se")
                var acao = readLine()!!.toInt()

                if (acao == 1) {
                    quinta.emitirSom()
                } else if (acao == 2) {
                    quinta.correr()
                } else {

                    while (true) {
                        println("Opção inválida!")
                        println("\nEscolha a ação do animal: ")
                        println("1 - Emitir som")
                        println("2 - Movimentar-se")
                        acao = readLine()!!.toInt()

                        try {
                            acao = readLine()!!.toInt()
                            break
                        } catch (e: Exception) {
                            println("Valor inválido!")
                        }
                    }
                }
            }

            2 -> {

                println("Escolha a ação do animal: ")
                println("1 - Emitir som")
                println("2 - Movimentar-se")
                var acao = readLine()!!.toInt()

                if (acao == 1) {
                    spirit.emitirSom()
                } else if (acao == 2) {
                    spirit.correr()
                } else {

                    while (true) {
                        println("Opção inválida!")
                        println("\nEscolha a ação do animal: ")
                        println("1 - Emitir som")
                        println("2 - Movimentar-se")
                        acao = readLine()!!.toInt()

                        try {
                            acao = readLine()!!.toInt()
                            break
                        } catch (e: Exception) {
                            println("Valor inválido!")
                        }
                    }
                }
            }
            3 -> {

                println("Escolha a ação do animal: ")
                println("1 - Emitir som")
                println("2 - Movimentar-se")
                var acao = readLine()!!.toInt()

                if (acao == 1) {
                    judite.emitirSom()
                } else if (acao == 2) {
                    judite.subir()
                } else {

                    while (true) {
                        println("Opção inválida!")
                        println("\nEscolha a ação do animal: ")
                        println("1 - Emitir som")
                        println("2 - Movimentar-se")
                        acao = readLine()!!.toInt()

                        try {
                            acao = readLine()!!.toInt()
                            break
                        } catch (e: Exception) {
                            println("Valor inválido!")
                        }
                    }
                }
            }
            else -> break
        }
    }
}