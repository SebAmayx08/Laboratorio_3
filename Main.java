import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titular: ");
        String nombre = scanner.nextLine();

        CuentaPuntos cuenta = new CuentaPuntos(nombre);

        // 1. Mostrar los puntos iniciales
        System.out.println("Puntos iniciales: " + cuenta.getPuntos());

        System.out.print("Puntos a registrar (1): ");
        int cantidad1 = scanner.nextInt();
        if (cuenta.sumarPuntos(cantidad1)) {
            System.out.println("-> Primera operación registrada con éxito.");
        } else {
            System.out.println("-> Rechazado: la cantidad debe ser positiva.");
        }

        System.out.print("Puntos a registrar (2): ");
        int cantidad2 = scanner.nextInt();
        if (cuenta.sumarPuntos(cantidad2)) {
            System.out.println("-> Segunda operación registrada con éxito.");
        } else {
            System.out.println("-> Rechazado: la cantidad debe ser positiva.");
        }

        System.out.println("\n--- RESUMEN FINAL ---");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Puntos finales: " + cuenta.getPuntos());

        scanner.close();
    }
}