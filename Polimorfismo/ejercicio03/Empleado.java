package Polimorfismo.ejercicio03;

public class Empleado {
    protected String nombre; 

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void resumen() {
        System.out.println("Resumen de empleado: " + nombre);
    }
}
