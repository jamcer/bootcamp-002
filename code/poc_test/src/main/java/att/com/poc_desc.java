package att.com;

public class poc_desc {

    private double DESCU;

    public poc_desc(double DESCU) {
        this.DESCU = DESCU;
    }

    public double calculateDesc(double price) {
        return price - price / DESCU;
    }

}

// dado porcentaje descuento
// dado un valor_producto = 100.0 como el valor del producto
// sea desccuento el valor sobre el producto
// sea cumple que valor con descuento es igual a helper.descuento
// (valor_producto cond escuento)