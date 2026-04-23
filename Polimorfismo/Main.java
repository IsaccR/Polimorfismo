package Polimorfismo;


import Polimorfismo.ejercicio01.*;
import Polimorfismo.ejercicio02.*;



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
 }
}