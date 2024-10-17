public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Menu menu = new Menu("Ejercicio 11",40);
        menu.addEntrada("Ejecutar ejercicio completo");

        while (true) {
            int opcion = menu.generarMenu();

            switch (opcion) {
                case 1:
                    ejecutarEjercicio();
                    break;
            }
        }
    }

    private static void ejecutarEjercicio() {
        Dinero dinero = new Dinero();
        IngresarHilo ingresarHilo = new IngresarHilo(dinero);
        ExtraerHilo extraerHilo = new ExtraerHilo(dinero);
        ingresarHilo.start();
        extraerHilo.start();
        try {
            ingresarHilo.join();
            extraerHilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dinero final: " + dinero.getDinero());
    }
}