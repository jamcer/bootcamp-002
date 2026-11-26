package att.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PocIvaTest {

    private final Poc_iva helper = new Poc_iva();

    @Test
    void shouldProductoNegativo() {
        double valorProducto = -100;

        assertEquals(
                0.0,
                helper.calculateIva(valorProducto),
                0.001);
    }

    @Test
    void shouldProductoCero() {
        double valorProducto = 0;

        assertEquals(
                0.0,
                helper.calculateIva(valorProducto),
                0.001);
    }
}