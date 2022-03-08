/*Autor: Daniel Feliciano

Programa: Solicitar a idade de várias pessoas e imprimir:
Total de pessoas com menos de 21 anos. Total de pessoas
com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

*/

fun main() {

    var total21 = 0; var total50 = 0
    var idade = 0

    while(idade != -99){

        print("Digite uma idade:")
        idade = readLine()!!.toInt()

        if(idade < 21 && idade != -99){
            total21++

        }else if(idade > 50){
            total50++
        }

    }

    println("O total de pessoas com menos de 21 anos é $total21, " +
            "e o total de pessoas com mais de 50 anos é $total50.")

}