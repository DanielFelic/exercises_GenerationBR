/*Autor: Daniel Feliciano

Programa: Ler 10 números e imprimir quantos
são pares e quantos são ímpares. (FOR)

*/

fun main() {

    var par = 0
    var impar = 0

    for(i in 1..10){

        print("Digite o ${i}º número:")
        val num = readLine()!!.toInt()

        if(num % 2 == 0){
            par++

        }else if(num % 2 != 0){
            impar++

            }
        }

        println("Entre os números digitados $par são pares e $impar são ímpares.")
    }
