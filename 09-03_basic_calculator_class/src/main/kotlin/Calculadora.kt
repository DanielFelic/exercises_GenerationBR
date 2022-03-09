class Calculadora (val num1: Double, val num2: Double) {


    companion object {
        //FUNÇÕES COM RETORNO

        //Função adição:
        fun adi(num1: Double, num2: Double): Double {

            val result = num1 + num2

            return result
        }

        //Função subtração:
        fun sub(num1: Double, num2: Double): Double {

            val result = num1 - num2

            return result
        }

        //Função multiplicação:
        fun mul(num1: Double, num2: Double): Double {

            val result = num1 * num2

            return result
        }

        //Função divisão:
        fun div(num1: Double, num2: Double): Double {

            val result = num1 / num2

            return result
        }

    }

}