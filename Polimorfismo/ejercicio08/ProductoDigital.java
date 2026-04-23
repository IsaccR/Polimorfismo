package Polimorfismo.ejercicio08;

public class ProductoDigital extends Producto {
    private String linkDescarga;

    public ProductoDigital(String nombre, double precio, String linkDescarga) {
        super(nombre, precio); 
        this.linkDescarga = linkDescarga;
    }

    @Override
    public void mostrarDescripcion() {
       
        super.mostrarDescripcion(); 
        
        System.out.println("Tipo: Digital | Enlace: " + linkDescarga);
    }
}
