/*Autor: Daniel Feliciano
Programa:

Fazer uma calculadora utilizando funções para cada operação matemática:
- Adição
- Subtração
- Multiplicação
- Divisão

*/

fun main(){
    var num1 = 0.0; var num2 = 0.0

    print("1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão" +
            "\nDigite a operação matemática escolhida:")

    var op = readLine()!!.toInt()

    while (op != 1 && op != 2 && op != 3 && op != 4){

        println("Operação inválida. Escolha uma das opções abaixo:")
        println("1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão")

        op = readLine()!!.toInt()
    }

    print("Digite o 1º número:")
    num1 = readLine()!!.toDouble()

    print("Digite o 2º número:")
    num2 = readLine()!!.toDouble()

    when(op){
        1 -> println("$num1 + $num2 = ${ adi(num1,num2)}")
        2 -> println("$num1 - $num2 = ${ sub(num1,num2)}")
        3 -> println("$num1 * $num2 = ${ mul(num1,num2)}")
        4 -> println("$num1 / $num2 = ${ div(num1,num2)}")

    }
}