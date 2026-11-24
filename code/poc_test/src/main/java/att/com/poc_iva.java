package att.com;

public class poc_iva {

    private double IVA_RATE;

    public poc_iva(double IVA_RATE) {
        this.IVA_RATE = IVA_RATE;
    }

    public double calculateIva(double price) {
        return price * IVA_RATE / 100;
    }

}
