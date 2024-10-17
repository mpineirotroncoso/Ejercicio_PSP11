public class Dinero {
    private int dinero = 2000;

    public void ingresarDinero(int cantidad) {
        synchronized (this) {
            dinero += cantidad;
            System.out.println("Dinero actual: " + dinero);
        }
    }

    public void extraerDinero(int cantidad) {
        synchronized (this) {
            dinero -= cantidad;
            System.out.println("Dinero actual: " + dinero);
        }
    }

    public int getDinero() {
        return dinero;
    }
}
