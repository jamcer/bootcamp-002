package att.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class poc_descTest {

    private final poc_iva helper = new poc_desc(15);

    @Test
    void shouldProductoNegativo() {
        double valorProducto = -100;

        assertEquals(
                0.0,
                helper.calculateDesc(valorProducto),
                0.001);
    }

    @Test
    void shouldProductoCero() {
        double valorProducto = 0;

        assertEquals(
                0.0,
                helper.calculateDesc(valorProducto),
                0.001);
    }
}