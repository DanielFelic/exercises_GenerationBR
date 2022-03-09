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
            println("$num1 + $num2 = ${Calculadora.adi(num1, num2)}")

        }else if(op == 2){
            println("$num1 - $num2 = ${Calculadora.sub(num1, num2)}")

        }else if (op == 3){
            println("$num1 X $num2 = ${Calculadora.mul(num1, num2)}")

        }else if(op == 4){
            println("$num1 + $num2 = ${Calculadora.div(num1, num2)}")

        }

    }else{
        println("Digite um número de 1 a 4.")
    }
}