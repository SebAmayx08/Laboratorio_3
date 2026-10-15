public class Estudiante {

    String nombre;
    String ficha;
    int trimestre;
    double promedio;

    public Estudiante(String nombre, String ficha, int trimestre, double promedio) {
        this.nombre = nombre;
        this.ficha = ficha;
        this.trimestre = trimestre;
        this.promedio = promedio;
    }

    void mostrarPerfil() {
        System.out.println("Estudiante: " + nombre + " | Ficha: " + ficha + " | Trimestre: " + trimestre + " | Promedio: " + promedio);
    }
    
    boolean aprobo() {
        return promedio >= 3.0;
    }
}