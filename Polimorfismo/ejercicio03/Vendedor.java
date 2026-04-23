package Polimorfismo.ejercicio03;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double comision) {
        
        super(nombre); 
        this.comision = comision;
    }

    @Override
    public void resumen() {
        System.out.println("Vendedor: " + nombre + " | Comisión acumulada: Q" + comision);
    }
}
