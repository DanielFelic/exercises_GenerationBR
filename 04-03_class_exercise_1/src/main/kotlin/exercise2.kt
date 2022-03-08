/*Autor: Daniel Feliciano

2) Crie uma classe avião e apresente os atributos e métodos referentes
 esta classe, em seguida crie um objeto avião, defina as instancias deste
 objeto e apresente as informações deste objeto no console.

*/

fun main() {

    val voo1 = Aviao()

    voo1.codVoo = 1234
    voo1.cidOrigem = "São Paulo"
    voo1.cidDestino = "Paris"
    voo1.capacidade = 375
    voo1.vagas = 100
    voo1.tempoVoo = 11

    println("INFORMAÇÕES VOO ${(voo1.codVoo)}" +
            "\n\nCidade de Origem: ${voo1.cidOrigem}" +
            "\nCidade de Destino: ${voo1.cidDestino}" +
            "\nTempo de chegada previsto: ${voo1.tempoVoo} horas" +
            "\nCapacidade de Passageiros: ${voo1.capacidade}" +
            "\nAssentos Disponíveis: ${voo1.vagas}"
    )

}