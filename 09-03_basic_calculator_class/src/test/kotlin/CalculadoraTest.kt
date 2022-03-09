import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    @Test
    fun adi() {
        assertEquals(10.0,Calculadora.adi(5.0,5.0))
    }

    @Test
    fun sub() {
        assertEquals(10.0,Calculadora.div(20.0,2.0))
    }

    @Test
    fun mul() {
        assertEquals(10.0,Calculadora.mul(2.0,5.0))
    }

    @Test
    fun div() {
        assertEquals(10.0,Calculadora.div(20.0,2.0))
    }
}