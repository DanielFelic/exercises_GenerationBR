/*Autor: Daniel Feliciano

Programa: Faça um programa que receba três inteiros e diga qual deles é o maior.

*/

fun main() {

    print("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()

    if(num1 > num2 && num1 > num3){

        println("Entre os números digitados o maior é $num1.")

    }else if(num2 > num1 && num2 > num3){

        println("Entre os números digitados o maior é $num2.")

    }else if(num3 > num1 && num3 > num2){

        println("Entre os números digitados o maior é $num3.")

    }else{

        println("O número digitado é inválido. Digite um número inteiro.")

    }

}