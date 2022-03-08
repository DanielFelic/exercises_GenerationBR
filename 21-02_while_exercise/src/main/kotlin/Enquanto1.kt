/* Autor: Daniel Feliciano
 *
 * Enquanto
 *
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores
 * numéricos e apresente no final o total do somatório, a média e o
 * total de valores lidos. O programa deve fazer as leituras dos valores
 * enquanto o usuário estiver fornecendo valores positivos. Ou seja,
 * o programa deve parar quando o usuário fornecer um valor negativo.
 */

import java.util.*

fun main() {

    var reader = Scanner(System.`in`); var soma = 0;
    var contador = 0; var num = 0; var media:Int

    while(num>=0){
        print("Digite um número: ")
        num = reader.nextInt()
        soma += num
        contador++
        media = soma / contador

        if(num>=0){
            println("Total somado: $soma \nMédia: $media " +
                    "\nTotal de valores lidos: $contador")
        }
    }











}