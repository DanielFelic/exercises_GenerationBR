/*Autor: Daniel Feliciano

Insira no list os seguintes números [5, 10, 15, 20, 25].

Remova o valor 5

Use um loop para mostrar os valores

*/

fun main() {

    val nums = mutableListOf(5, 10, 15, 20, 25)

    nums.remove(5)

    for (i in nums){
        println(i)
    }
}