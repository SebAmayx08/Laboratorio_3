public class MainTermometro {

    public static void main(String[] args) {
        Termometro t1 = new Termometro(0);
        Termometro t2 = new Termometro(25);

        t1.mostrarCelsius();
        System.out.println(" -> " + t1.convertirAFahrenheit() + " °F");

        t2.mostrarCelsius();
        System.out.println(" -> " + t2.convertirAFahrenheit() + " °F");
    }
}