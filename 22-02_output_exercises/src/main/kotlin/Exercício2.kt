/*Autor: Daniel Feliciano

Programa: Faça um programa em que o usuário digite o diâmetro de
um círculo e calcule a área e o perímetro dele.

*/
import kotlin.math.*

fun main(){

    print("Digite o diâmetro do círculo: ")
    val diam = readLine()!!.toDouble()

    println("A área do círculo é ${3.14*(diam/2).pow(2)}, " +
            "e o seu perímetro é ${"%.1f".format(2*3.14*(diam/2))}.")

}