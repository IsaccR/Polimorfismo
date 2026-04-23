package Polimorfismo.ejercicio06;

public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es: " + nombre);
    }
}
