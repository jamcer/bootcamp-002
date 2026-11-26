package att.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PocDescTest {

    private final PocDesc helper = new PocDesc(15);

    @Test
    void shouldReturnZeroWhenProductoIsNegative() {
        double valorProducto = -100.0;

        double resultado = helper.calculateDesc(valorProducto);

        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void shouldReturnZeroWhenProductoIsZero() {
        double valorProducto = 0.0;

        double resultado = helper.calculateDesc(valorProducto);

        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void shouldCalculateDiscountWhenProductoIsPositive() {
        double valorProducto = 100.0;

        double resultado = helper.calculateDesc(valorProducto);

        assertEquals(15.0, resultado, 0.001);
    }

    @Test
    void shouldCalculateDiscountWithDecimals() {
        double valorProducto = 199.99;

        double resultado = helper.calculateDesc(valorProducto);

        assertEquals(29.9985, resultado, 0.001);
    }
}