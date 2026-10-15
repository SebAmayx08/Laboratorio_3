public class Termometro {

    double temperaturaCelsius;

    public Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    void mostrarCelsius() {
        System.out.print(temperaturaCelsius + " °C");
    }
    
    double convertirAFahrenheit() {
        return (temperaturaCelsius * 9 / 5) + 32;
    }
}