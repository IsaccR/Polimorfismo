package Polimorfismo.ejercicio08;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDescripcion() {
        System.out.println("Producto: " + nombre + " | Precio: Q" + precio);
    }
}
