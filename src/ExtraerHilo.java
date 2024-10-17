public class ExtraerHilo extends Thread{
    private Dinero dinero;

    public ExtraerHilo(Dinero dinero) {
        this.dinero = dinero;
    }

    @Override
    public void run() {
        dinero.extraerDinero(100);
        dinero.extraerDinero(100);
        dinero.extraerDinero(100);
        dinero.extraerDinero(100);
        dinero.extraerDinero(100);
    }
}
