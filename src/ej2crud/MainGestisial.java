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

				// Imprimimos el
				System.out.println("Indique el stock del articulo");

				stock = sc.nextInt();
				sc.nextLine();
				if (ArrayGestisimal.altaArticulo(codigo, descripcion, compra, venta, stock)) {
					System.out.println("Articulo añadido");
				} else {
					System.out.println("Lista de articulos llena");
				}
				break;
			case 3:
				System.out.println("Indique el codigo del articulo que quiere eliminar");
				codigo = sc.nextLine();

				if (ArrayGestisimal.bajaArticulo(codigo)) {
					System.out.println("Articulo eliminado");
				} else {
					System.out.println("El articulo no existe");
				}
				break;
			case 4:
				System.out.println("Inserte el codigo del articulo que quiere modificar");
				codigo = sc.nextLine();
				System.out.println("Inserte la descripcion nueva");
				descripcion = sc.nextLine();
				System.out.println("Inserte el precio de compra nuevo");
				compra = sc.nextDouble();
				sc.nextLine();
				System.out.println("Inserte el precio de venta nuevo");
				venta = sc.nextDouble();
				sc.nextLine();
				if (ArrayGestisimal.modificar(codigo, descripcion, compra, venta)) {
					System.out.println("Articulo modificado");
				} else {
					System.out.println("El articulo no existe");
				}
				break;
			case 5:
				System.out.println("Inserte el codigo");
				codigo = sc.nextLine();
				System.out.println("Inserte la entrada de mercancia");
				stock = sc.nextInt();
				sc.nextLine();
				if (ArrayGestisimal.entradaMercancia(codigo, stock)) {
					System.out.println("Se ha realizado la entrada de la mercancia correctamente");
				} else {
					System.out.println("No se ha realizado la entrada de la mercancia");
				}
				break;
			case 6:
				System.out.println("Inserte el codigo");
				codigo = sc.nextLine();
				System.out.println("Inserte la salida de mercancia");
				stock = sc.nextInt();
				sc.nextLine();
				if (ArrayGestisimal.salidaMercancia(codigo, stock)) {
					System.out.println("Se ha realizado la salida de la mercancia correctamente");
				} else {
					System.out.println("No se ha realizado la salida de la mercancia");
				}
				break;
			case 7:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Esta opcion no existe");
			}
		} while (ops != 7);

		sc.close();

	}

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
