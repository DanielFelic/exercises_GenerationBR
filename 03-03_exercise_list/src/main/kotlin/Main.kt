/*Autor: Daniel Feliciano

Crie um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

*/


fun main() {


    var estoque = mutableListOf<String>()

    while (true) {
        println(
            "\n***ESTOQUE***" + "\n\n1.Adicionar item" + "\n2.Remover item"
                    + "\n3.Atualizar item" + "\n4.Todos os itens" + "\n5.Sair" +
                    "\n\nDigite a opção escolhida:")

        var op = readLine()!!.toInt()

        when(op){
            1 -> {
                print("Digite um item para ser adicionado: ")
                val item = readLine()!!
                if (item.isEmpty()){
                println("Item inválido.")

                }else{
                estoque.add(item)
                println("Item adicionado com sucesso!")
                }
            }
            2 -> {
                print("Digite um item para ser removido: ")
                val item = readLine()!!
                if (item.isEmpty()){
                    println("Item inválido.")

                }else{
                    if(estoque.contains(item)){
                        estoque.remove(item)
                        println("O item $item foi removido do estoque.")
                    }else{
                        println("O item $item não existe no estoque.")
                    }
                }
            }
            3 -> {
                if (estoque.isEmpty()) {
                    println("O estoque está vazio.")

                }else {
                    println("Selecione um item de 1 a ${estoque.size}: ")
                    val pos = (readLine()!!.toInt() - 1)

                    if (pos in 1..(estoque.size)) {
                        println("\nDigite o novo item: ")
                        val item = readLine()!!

                        estoque[pos] = item
                    } else {
                        println("Item não existe no estoque.")
                    }
                }
            }
            4 -> {
                if (estoque.isEmpty()){
                    println("O estoque está vazio.")

                }else{
                    println("***ITENS DO ESTOQUE***")

                    estoque.forEach{

                        println(it)
                    }


                }

            }

            else -> break

        }

    }

   }




