package encapsulamento

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteTest {

    val cliente1 = Cliente("Daniel", "Paulínia")

    @Test
    fun addCompra() {

        cliente1.addCompra("Banana")
        assertEquals(1, cliente1.totalCompras())
    }

    @Test
    fun removeCompra() {

        cliente1.addCompra("Banana")
        cliente1.addCompra("Pera")

        cliente1.removeCompra("Pera")

        assertEquals(1, cliente1.totalCompras())
    }

    @Test
    fun totalCompras() {

        assertEquals(0, cliente1.totalCompras())
    }
}