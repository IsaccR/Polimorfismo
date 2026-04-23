package Polimorfismo.ejercicio06;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;

    public Estudiante(String nombre, String carnet, String carrera) {
        
        super(nombre);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        
        System.out.println("Soy el estudiante " + nombre + ".");
        System.out.println("Carnet: " + carnet + " | Carrera: " + carrera);
    }
}
