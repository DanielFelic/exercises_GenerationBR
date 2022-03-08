fun main() {

    val uno = Carro()

    uno.ano = 2008
    uno.cor = "Branco"
    uno.marca = "Fiat"
    uno.roda = 15
    uno.modelo = 2009
    uno.potencia = 50.0

    println("A marca do carro é ${uno.marca}")
    println("O modelo do carro é ${uno.modelo}")
    println("O ano do carro é ${uno.ano}")
    println("A cor do carro é ${uno.cor}")
    println("O carro tem ${uno.potencia}cv de potência")
    println("O carro possui rodas aro ${uno.roda}\'")

}