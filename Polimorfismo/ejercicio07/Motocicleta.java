package Polimorfismo.ejercicio07;

public class Motocicleta extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Motocicleta: Se activa el switch, se verifica el neutro y se presiona el botón de arranque eléctrico.");
        System.out.println("¡Motor en marcha!");
    }
}