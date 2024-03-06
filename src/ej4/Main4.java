package ej4;

import java.util.Scanner;

public class Main4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Creacion de las variables
		String nombre;
		double precio;
		int cantidad;
		int ops;
		
		//Imprimimos en consola que nos indique el nombre del articulo
		System.out.println("Indique el nombre del articulo");
		
		//Escribimos nombre
		nombre = sc.nextLine();
		
		//Imprimimos en consola que nos indique el precio del articulo
		System.out.println("Indica el precio del articulo");
		
		//Escribimos precio
		precio = sc.nextDouble();
		
		//Imprimimos en consola que nos indique la cantidad de articulos
		System.out.println("Indica la cantidad de articulos");
		
		//Escribimos cantidad
		cantidad = sc.nextInt();
		
		//Creamos el objeto y le indicamos los parametros de entrada
		Articulo art = new Articulo(nombre,precio,cantidad);
		
		do {
			System.out.println("MENU");
			System.out.println("1. Informacion del articulo");
			System.out.println("2. Mostrar precio con IVA");
			System.out.println("3. Mostrar descuento del articulo");
			System.out.println("4. Cantidad de objetos tras la venta");
			System.out.println("5. Cantidad");
			
			
		}while();
		
		
		
	}

}
