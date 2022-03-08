/*Autor: Daniel Feliciano

Programa: Faça um programa em que permita a entrada de um número
qualquer e exiba se este número é par ou ímpar. Se for par exiba
também a raiz quadrada do mesmo; se for ímpar exiba o número
elevado ao quadrado.

*/

import kotlin.math.*

fun main() {

    print("Digite um número:")
    val num = readLine()!!.toDouble()

    if(num % 2 == 0.0){

        println("O número digitado foi ${"%.0f".format(num)} " +
                "e sua raiz quadrada é ${"%.2f".format(sqrt(num))}.")

    }else{

        println("O número digitado foi ${"%.0f".format(num)} " +
                "e ele elevado ao quadrado é ${"%.2f".format(num.pow(2))}.")

    }

}