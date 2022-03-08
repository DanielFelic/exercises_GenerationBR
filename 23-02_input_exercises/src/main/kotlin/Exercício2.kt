/*Autor: Daniel Feliciano

Programa: Faça um programa que entre com três números e coloque em ordem crescente.

*/

fun main() {

    print("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()

    if(num1 <= num2 && num2 <= num3){

        println("$num1 - $num2 - $num3")

    }else if(num1 <= num3 && num3 <= num2){

        println("$num1 - $num3 - $num2")

    }else if(num2 <= num1 && num1 <= num3) {

        println("$num2 - $num1 - $num3")

    }else if(num2 <= num3 && num3 <= num1) {

        println("$num2 - $num3 - $num1")

    }else if(num3 <= num1 && num1 <= num2) {

        println("$num3 - $num1 - $num2")

    }else{

        println("$num3 - $num2 - $num1")

    }

}