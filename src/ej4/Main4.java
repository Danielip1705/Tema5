package ej4;

import java.util.Scanner;

public class Main4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Creacion de las variables
		String nombre;
		double precio;
		int cantidad;
		int descuento;
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
			System.out.println("5. Cantidad de objetos a almacenar");
			System.out.println("6. Salir del Programa");
			
			ops = sc.nextInt();
			
			switch (ops) {
			
			case 1:
				art.imprimirInformacion();
				break;
			case 2:
				System.out.println(art.getPVP());
				art.getPVP();
				break;
			case 3:
				System.out.println("Indique que descuento tiene el articulo");
				
				descuento = sc.nextInt();
				
				System.out.println(art.getPVPDescuento(descuento));
				
				break;
			case 4:
				System.out.println("Indique cuantos articulos se han vendido");
				
				cantidad = sc.nextInt();
				if(art.vender(cantidad)) {
					System.out.println();
				}
			
				break;
			case 5:
				System.out.println("Indique cuantos articulos se van a almacenar");
				
				cantidad = sc.nextInt();
				
				if(art.almacenar(cantidad)) {
					
				}
				
				break;
			case 6:
				System.out.println("Saliendo del programa");
				break;
				
				default:
					System.out.println("Esta opcion no existe");
			}
			
		}while(ops!=5);
		
		
		
	}

}
