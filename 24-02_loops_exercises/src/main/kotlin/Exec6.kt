/*Autor: Daniel Feliciano

Programa: Escrever um programa que receba vários números
inteiros no teclado. E no final imprimir a média dos
números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

*/

fun main() {

    var soma = 0
    var contador = -1

    do{
        print("Digite um número inteiro:")
        val num = readLine()!!.toInt()

        if(num % 3 == 0) {
            soma += num
            contador ++
        }

    }while (num != 0)

    println("Entre os números digitados a média dos múltiplos de 3 é ${soma/contador}.")

}