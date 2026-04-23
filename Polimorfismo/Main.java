package Polimorfismo;


import Polimorfismo.ejercicio01.*;
import Polimorfismo.ejercicio02.*;
import Polimorfismo.ejercicio03.*;
import Polimorfismo.ejercicio04.*;
import Polimorfismo.ejercicio05.*;
import Polimorfismo.ejercicio06.*;



public class Main {
 public static void main(String[] args) {
     
     //Ejercicio 1 Animal 
	 System.out.println(" EJERCICIO 1 ");
     Animal miAnimal = new Perro(); 
     miAnimal.hacerSonido();

     //Ejercicio 2 Figura 
     System.out.println( "\n Ejercicio 2:");
 
     Figura miFigura = new Rectangulo(10.5, 5.0); 
     miFigura.area(); 
  
    //Ejercicio 3 Empleado 
  
     System.out.println("\n Ejercicio 3 ");

     Empleado miEmpleado = new Vendedor("Carlos Mendoza", 1250.75);

     miEmpleado.resumen();

    //Ejercicio 4 Cuenta 
    System.out.println("\n Ejercicio 4 ");

    Cuenta miCuenta = new CuentaAhorro(1000.0);

    miCuenta.depositar(500.0);
    
    //Ejercicio 5 Transporte 
    System.out.println("\n Ejercicio 5 ");

    Transporte miTransporte = new Avion();

     miTransporte.moverse();
     
     //Ejercicio 6 Persona 
     
     System.out.println("\n Ejercicio 6 ");

    Persona miPersona = new Estudiante("Luis Perez","2024-0512", "Sistemas");

     miPersona.presentarse();
 }
}