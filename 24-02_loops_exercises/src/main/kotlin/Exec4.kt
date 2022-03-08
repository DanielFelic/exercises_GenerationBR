/*Autor: Daniel Feliciano

Programa: Uma empresa desenvolveu uma pesquisa para saber as
características psicológicas dos indivíduos de uma região.
Para tanto, a cada uma das pessoas era perguntado: idade,
sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e
3, se a pessoa era agressiva). Pede-se para elaborar um
sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

- o número de pessoas calmas; (TOTAL)
- o número de mulheres nervosas;
- o número de homens agressivos;
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos.

*/

fun main() {

    var contador = 0; var totalC = 0; var sex1 = 0; var sex2 = 0;
    var sex3 = 0;  var emo1 = 0; var emo2 = 0; var emo3 = 0;
    var mulN = 0; var homA = 0; var outC = 0; var totN = 0;
    var totC = 0

    while(contador<150){

        print("Digite a idade:")
        var idade = readLine()!!.toInt()
        contador++

        print("Escolha o sexo [1-feminino | 2-masculino | 3-Outros]:")
        var sexo = readLine()!!.toInt()

        when(sexo){
            1 -> sex1++
            2 -> sex2++
            3 -> sex3++
        }

        println("Escolha seu estado emocional:" +
                "\n1 - Calma(o)" +
                "\n2 - Nervosa(o)"
                + "\n3 - Agressiva(o)")
        var emo = readLine()!!.toInt()

        when(emo){
            1 -> emo1++
            2 -> emo2++
            3 -> emo3++
        }

        if(sex1 == 1 && emo2 == 1 ){
            mulN++

        }else if(sex2 == 1 && emo3 == 1){
            homA++

        }else if(sex3 == 1 && emo1 == 1){
            outC++

        }else if(idade < 40 && emo2 == 1){
            totN++

        }else if(idade < 18 && emo1 == 1){
            totC++

        }else if(emo == 1){
            totalC++

        }

    }

    println("1 - número de pessoas calmas: $totalC\n" +
            "2 - número de mulheres nervosas: $mulN\n" +
            "3 - número de homens agressivos: $homA\n" +
            "4 - número de outros calmos: $outC\n" +
            "5 - número de pessoas nervosas com mais de 40 anos: $totN\n" +
            "6 - número de pessoas calmas com menos de 18 anos: $totC")

}