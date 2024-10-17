public class IngresarHilo extends Thread{
    private Dinero dinero;

    public IngresarHilo(Dinero dinero) {
        this.dinero = dinero;
    }

    @Override
    public void run() {
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
        dinero.ingresarDinero(100);
    }
}
