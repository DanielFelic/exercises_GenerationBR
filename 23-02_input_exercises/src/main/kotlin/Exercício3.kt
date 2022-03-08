/*Autor: Daniel Feliciano

Programa: Faça um programa que receba a idade de uma pessoa e
mostre na saída em qual categoria ela se encontra:
- 10-14 infantil
- 15-17 juvenil
- 18-25 adulto

*/

fun main() {
    print("Para saber sua categoria digite sua idade:")
    val num = readLine()!!.toInt()

    when(num){
        in 1..9 -> println("Você ainda não tem idade suficiente.")
        in 10..14 -> println("Você é da categoria Infantil.")
        in 15..17 -> println("Você é da categoria Juvenil.")
        in 18..25 -> println("Você é da categoria Adulto.")
        else -> println("Infelizmente não possuímos categoria" +
                " para sua idade no momento.")
    }

}