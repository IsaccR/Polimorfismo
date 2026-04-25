package Polimorfismo;


import Polimorfismo.ejercicio01.*;
import Polimorfismo.ejercicio02.*;
import Polimorfismo.ejercicio03.*;
import Polimorfismo.ejercicio04.*;
import Polimorfismo.ejercicio05.*;
import Polimorfismo.ejercicio06.*;
import Polimorfismo.ejercicio07.*;
import Polimorfismo.ejercicio08.*;
import Polimorfismo.ejercicio09.*;
import Polimorfismo.ejercicio10.*;



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
    
     //Ejercicio 7 Vehiculo
     System.out.println("\n Ejercicio 7 ");

     Vehiculo miMoto = new Motocicleta();

  
     miMoto.encender();
     
     //Ejercicio 8 Producto
     System.out.println("\n Ejercicio 8 ");

     Producto miProducto = new ProductoDigital("Curso de Java Avanzado", 150.0, "https://java.com/download");

     miProducto.mostrarDescripcion();
     
     //Ejercicio 9 Instrumento
     System.out.println("\n Ejercicio 9 ");

       Instrumento miInstrumento = new Guitarra();

       miInstrumento.tocar();
       
       //Ejercicio 10 Trabajador
       System.out.println("\n Ejercicio 10 ");

    
       Trabajador miTrabajador = new TrabajadorporHora(40, 65.50);

    
        miTrabajador.calcularPago();
     
     
     
 }
}


	//en este trabajo se aplicaron los conceptos de herencia, sobreeescritura de 
    //metodos y polimorfismo mediante la creacion de distintas clases relacionadas entre si.
    //primero defiia la clase padre con sus atributos y metodos luego creaba las clases hijas que heredaban
    // esos atributos y sobreescribia los metodos.
    //Esto me permitia comprender como reutilzar codigo y como especializar funciones que sirven en ambas.