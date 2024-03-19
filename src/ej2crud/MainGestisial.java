package ej2crud;

import java.util.Scanner;

public class MainGestisial {

	public static void main(String[] args) {
		// Declaracion de variables
		String codigo;
		String descripcion;
		double compra;
		double venta;
		int stock;
		int ops = 0;

		// Creacion del scanner
		Scanner sc = new Scanner(System.in);

		// Creamos bucle while
		do {

			// Imprimimos menu
			menu();

			// Escribimos ops
			ops = sc.nextInt();

			// Limpiamos el buffer de escritura
			sc.nextLine();

			// Declaramos switch teniendo en cuenta el resultado de ops
			switch (ops) {

			// Caso 1
			case 1:

				// Imprimimos el listado a traves de la funcion listado de la clase
				// arrayGestisimal
				ArrayGestisimal.listado();

				// Rompemos caso
				break;

			// Caso 2
			case 2:

				// Imprimimos en consola el titulo del programa
				System.out.println("Registro de articulos");

				// Imprimimos en consola que indique el codigo
				System.out.println("Indique el codigo del articulo");

				// Escribimos codigo
				codigo = sc.nextLine();

				// Imprimimos en consola que indique la descripcion
				System.out.println("Indique la descripcion del articulo");

				// escribimos descripcion
				descripcion = sc.nextLine();

				// Imprimimos que indique el precio de la compra
				System.out.println("Indique el precio de compra del articulo");

				// Escribimos compra
				compra = sc.nextDouble();

				// Imprimimos que indique el precio de venta del articulo
				System.out.println("Indique el precio de venta del articulo");

				// escribimos venta
				venta = sc.nextDouble();

				// Limpiamos buffer
				sc.nextLine();

				// Imprimimos en consola que nos indique el stock del articulo
				System.out.println("Indique el stock del articulo");
				//EScribimos stock
				stock = sc.nextInt();
				//Limpiamos buffer
				sc.nextLine();
				//Declaramos con if que si el resultado de la funcion altaArticulo es true
				if (ArrayGestisimal.altaArticulo(codigo, descripcion, compra, venta, stock)) {
					//Que imprima en consola que el articulo se ha añadido
					System.out.println("Articulo añadido");
					//y si no
				} else {
					//Que imprimima en consola que la lista de articulos esta llena
					System.out.println("Lista de articulos llena");
				}
				//Rompemos caso 4
				break;
			case 3:
				//Imprimimos en consola que indique el codigo del articulo
				System.out.println("Indique el codigo del articulo que quiere eliminar");
				//Escribimos codigo
				codigo = sc.nextLine();
				//Declaramos con if que si el resultado de la funcion bajaArticulo es true
				if (ArrayGestisimal.bajaArticulo(codigo)) {
					//Que imprima en consola que el articulo se ha eliminado
					System.out.println("Articulo eliminado");
					//Y si no
				} else {
					//Que imprima en consola que el articulo no existe
					System.out.println("El articulo no existe");
				}
				//Rompemos caso 3
				break;
			case 4:
				//Imprimimos en consola que inserte el codigo del articulo a eliminar
				System.out.println("Inserte el codigo del articulo que quiere modificar");
				//Escribimos codigo
				codigo = sc.nextLine();
				//Imprimimos en consola que inserte la descripcion nueva
				System.out.println("Inserte la descripcion nueva");
				//Escribimos descripcion
				descripcion = sc.nextLine();
				//Imprimimos en consola que inserte el precio de compra nuevo
				System.out.println("Inserte el precio de compra nuevo");
				//Escribimos compra
				compra = sc.nextDouble();
				//Limpiamos buffer
				sc.nextLine();
				//Imprimimos en consola que inserte el precio de venta nuevo
				System.out.println("Inserte el precio de venta nuevo");
				//Escribimos venta 
				venta = sc.nextDouble();
				//Limpiamos buffer
				sc.nextLine();
				//Declaramos con un if que si el resultado de la funcion modificar es true
				if (ArrayGestisimal.modificar(codigo, descripcion, compra, venta)) {
					//Que imprima en consola que le articulo ha sido modificado
					System.out.println("Articulo modificado");
					//Y si no
				} else {
					//Imprimimos en consola que el articulo no existe
					System.out.println("El articulo no existe");
				}
				//Rompemos caso 4
				break;
			case 5:
				//Imprimimos en consola que inserte el codigo
				System.out.println("Inserte el codigo");
				//Escribimos codigo
				codigo = sc.nextLine();
				//Imprimimos en consola que inserte la entrada de la mercacion
				System.out.println("Inserte la entrada de mercancia");
				//Escribimos stock
				stock = sc.nextInt();
				//Limpiamos buffer
				sc.nextLine();
				//Declaramos con if que si el resultado de la funcion entradaMercacion es true
				if (ArrayGestisimal.entradaMercancia(codigo, stock)) {
					//Que imprimia en consola que se ha realizado la entreda de la mercacia
					System.out.println("Se ha realizado la entrada de la mercancia correctamente");
					//Y si no
				} else {
					//Imprimimos en consola que no se ha realizado la entrada de la mercacion
					System.out.println("No se ha realizado la entrada de la mercancia");
				}
				//Rompemos caso 5
				break;
			case 6:
				//Imprimimos en consola que inserte el codigo
				System.out.println("Inserte el codigo");
				//Escribimos codigo
				codigo = sc.nextLine();
				//Imprimimos en consola que inserte la salida de la mercacia
				System.out.println("Inserte la salida de mercancia");
				//Escribimos stock
				stock = sc.nextInt();
				//Limpiamos buffer
				sc.nextLine();
				//Declaramos con if que si el resultado de la funcion salidaMercancia es true
				if (ArrayGestisimal.salidaMercancia(codigo, stock)) {
					//Que imprima que se ha realizado la salida de la mercacia
					System.out.println("Se ha realizado la salida de la mercancia correctamente");
					//y si no
				} else {
					//Que imprima que no se ha realizado la salida de la mercancia
					System.out.println("No se ha realizado la salida de la mercancia");
				}
				//Rompemos caso 6
				break;
			case 7:
				//Imprimimos en consola que se esta saliendo del programa
				System.out.println("Saliendo del programa");
				//Rompemos caso 7
				break;
			}
			//Se termina el bucle si ops es igual que 7
		} while (ops != 7);

		//Cerramos scanner
		sc.close();

	}

	/**
	 * Funcion que muestra el menu
	 */
	public static void menu() {
		System.out.println("Indique que opciones quiere elegir");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificacion");
		System.out.println("5. Entrada de mercancia");
		System.out.println("6. Salida de mercancia");
		System.out.println("7. Salir");
	}

}
