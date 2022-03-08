/*Autor: Daniel Feliciano

4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina
as instancias deste objeto e apresente as informações deste objeto no console.

*/

fun main() {

    val funcionario = Func()

    funcionario.nome = "Daniel de Souza Feliciano"
    funcionario.codFunc = 12345
    funcionario.idade = 23
    funcionario.cargo = "Desenvolvedor Mobile"
    funcionario.email = "danielfeliciano.dev@gmail.com"
    funcionario.telefone = "11912345678"
    funcionario.endereco = "Paulínia - SP"

    println("CADASTRO DO FUNCIONÁRIO" +
            "\n\nCódigo: ${funcionario.codFunc}" +
            "\nNome: ${funcionario.nome}" +
            "\nCargo: ${funcionario.cargo}" +
            "\nIdade: ${funcionario.idade}" +
            "\nTelefone: ${funcionario.telefone}" +
            "\nEmail: ${funcionario.email}" +
            "\nEndereço: ${funcionario.endereco}"
    )
}