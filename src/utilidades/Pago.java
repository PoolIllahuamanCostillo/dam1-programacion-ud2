package utilidades;

public class Pago {

    public Pago(int i) {
        //TODO Auto-generated constructor stub
    }

    // Pagar en efectivo
    public void pagar(double cantidad) {
        System.out.println("Pagaste " + cantidad + " euros en efectivo.");
    }

    // Pagar con tarjeta (necesita pin)
    public void pagar(double cantidad, String pin) {
        System.out.println("Pagaste " + cantidad + " euros con tarjeta usando pin: " + pin);
    }

    // Pagar con Bizum (necesita teléfono)
    public void pagar(double cantidad, int telefono) {
        System.out.println("Pagaste " + cantidad + " euros con Bizum al número: " + telefono);
    }
}