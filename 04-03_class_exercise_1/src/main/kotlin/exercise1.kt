/*Autor: Daniel Feliciano

1) Crie uma classe cliente e apresente os atributos e métodos referentes
 esta classe, em seguida crie um objeto cliente, defina as instancias deste
 objeto e apresente as informações deste objeto no console.

*/

fun main() {

    val cliente1 = Cliente()

    cliente1.nome = "Daniel Feliciano"
    cliente1.usuario = "DanielFelic"
    cliente1.email = "danielfeliciano.dev@gmail.com"
    cliente1.senha = "12345678"
    cliente1.dataNas = "20/05/1998"

    println("CADASTRO CLIENTE ${(cliente1.nome).uppercase()}" +
            "\n\nNome: ${ cliente1.nome}" + "\nUsuário: ${ cliente1.usuario}" +
            "\nEmail: ${cliente1.email}" + "\nSenha: ${cliente1.senha}" +
            "\nData de Nascimento: ${cliente1.dataNas}"
            )


}