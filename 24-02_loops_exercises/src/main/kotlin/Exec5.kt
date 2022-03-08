/*Autor: Daniel Feliciano

Programa: Crie um programa que leia um número do teclado
até que encontre um número igual a zero. No final, mostre
a soma dos números digitados.(DO...WHILE)

*/

fun main() {

    var soma = 0

    do{
        print("Digite um número:")
        var num = readLine()!!.toInt()
        soma += num


    }while(num != 0)

    println("A soma dos números digitados é $soma.")

}