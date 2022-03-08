/*Autor: Daniel Feliciano

Programa: O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

*/

fun main() {

    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()

    println("Você nasceu no ano de ${2022-idade}.")

}