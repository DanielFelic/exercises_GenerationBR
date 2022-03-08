/*Autor: Daniel Feliciano
Programa:

Fazer uma calculadora utilizando funções para cada operação matemática:
- Adição
- Subtração
- Multiplicação
- Divisão

*/

fun main() {
    var num1 = 0.0; var num2 = 0.0

    print("1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão" +
            "\nDigite a operação matemática escolhida:")

    val op = readLine()!!.toInt()

    if (op == 1 || op == 2 || op == 3 || op == 4){

        print("Digite o 1º número:")
        num1 = readLine()!!.toDouble()

        print("Digite o 2º número:")
        num2 = readLine()!!.toDouble()

        if(op == 1){
            adi1(num1,num2)

        }else if(op == 2){
            sub1(num1,num2)

        }else if (op == 3){
            mul1(num1,num2)

        }else if(op == 4){
            div1(num1,num2)

        }

    } else{
        println("Digite um número de 1 a 4.")

    }

}