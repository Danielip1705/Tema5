package ej4;

import java.util.Scanner;

public class Main4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creacion de las variables
		String nombre;
		double precio;
		int cantidad;
		int ops;

		// Imprimimos en consola que nos indique el nombre del articulo
		System.out.println("Indique el nombre del articulo");

		// Escribimos nombre
		nombre = sc.nextLine();

		// Imprimimos en consola que nos indique el precio del articulo
		System.out.println("Indica el precio del articulo");

		// Escribimos precio
		precio = sc.nextDouble();

		// Imprimimos en consola que nos indique la cantidad de articulos
		System.out.println("Indica la cantidad de articulos");

		// Escribimos cantidad
		cantidad = sc.nextInt();

		// Creamos el objeto y le indicamos los parametros de entrada
		Articulo art = new Articulo(nombre, precio, cantidad);

		// Creamos bucle do while
		do {

			menu();

			// Escribimos ops
			ops = sc.nextInt();

			opcionesArticulo(ops, art);

			// Salimos del bucle si ops es = que 6
		} while (ops != 6);

		// Cerramos scanner
		sc.close();

	}

	/**
	 * Funcion que realiza un switch segun el resultado de ops, donde se muestra el
	 * resultado las funciones de la clase articulo a traves del objeto art
	 * 
	 * @param ops Numero entero que sera el caso a mostrar del switch
	 * @param art Objeto de la clase Articulo donde mostrara las funciones de dicha
	 *            clase
	 */
	public static void opcionesArticulo(int ops, Articulo art) {
		int cantidad;
		int descuento;
		// Creamos switch teniendo en cuenta la variable ops
		switch (ops) {

		// En el caso 1 imprimiremos la informacion del articulo
		case 1:
			art.imprimirInformacion();
			// Rompemos el caso 1
			break;

		// En el caso 2 mostraremos el precio del articulo mas el IVA
		case 2:
			System.out.println("Precio con IVA: " + art.getPVP() + "€");
			art.getPVP();

			// Rompemos el caso 2
			break;

		// En el caso 3, Indicamos al usuario que indique el porcentaje del descuento
		// del articulo para mostrarle el precio
		case 3:
			System.out.println("Indique que descuento tiene el articulo");

			descuento = sc.nextInt();

			System.out.println("Precio con un " + descuento + "% de descuento: " + art.getPVPDescuento(descuento));

			// rompemos caso 3
			break;

		// En el caso 4 indicamos al usuario cuantos articulos se ha vendido para
		// restarlo a cantidad
		case 4:
			System.out.println("Indique cuantos articulos se han vendido");

			cantidad = sc.nextInt();
			if (art.vender(cantidad)) {
				System.out.println("Comprobando...");
				System.out.println("Articulos vendidos: " + cantidad);
			} else {
				System.out.println("Comprobando...");
				System.out.println("Se ha producido un error");
			}

			// Rompemos caso 4
			break;

		// En el caso 5 indicamos al usuario cuantos articulos se ha almacenado para
		// sumarlo a cantidad
		case 5:
			System.out.println("Indique cuantos articulos se van a almacenar");

			cantidad = sc.nextInt();

			if (art.almacenar(cantidad)) {
				System.out.println("Comprobando...");
				System.out.println("Articulos almacenados: " + cantidad);
			} else {
				System.out.println("Comprobando...");
				System.out.println("Se ha producido un error");
			}

			// Rompemos caso 5
			break;

		// En el caso 6 indicamos que al usuario que se esta saliendo del programa
		case 6:
			System.out.println("Saliendo del programa");
			break;

		default:
			System.out.println("Esta opcion no existe");
		}
	}

	/**
	 * Imprimimos en consola el menu
	 */
	public static void menu() {
		// Imprimimos en consola el menu
		System.out.println("-------------------------------------");
		System.out.println("1. Informacion del articulo");
		System.out.println("2. Mostrar precio con IVA");
		System.out.println("3. Mostrar descuento del articulo");
		System.out.println("4. Cantidad de objetos tras la venta");
		System.out.println("5. Cantidad de objetos a almacenar");
		System.out.println("6. Salir del Programa");
	}

}
