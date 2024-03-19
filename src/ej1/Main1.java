package ej1;

import java.util.Scanner;

public class Main1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la variables para utilizar el programa
		int ops;
		String nombre, dni;
		double dinero;

		// Imprimos en consola que indique el dni
		System.out.println("Inserte su dni");

		//Escribimos dni
		dni = sc.nextLine();

		//Imprimimos en consola que indique el nombre
		System.out.println("Inserte el nombre");

		//Escribimos nombre
		nombre = sc.nextLine();
		
		//Imprimimos en consola que inserte el dinero
		System.out.println("Inserte el dinero");

		//Escribimos dinero
		dinero = sc.nextDouble();

		//Creamos objeto c1 con los atributos inicializados
		CuentaCorriente c1 = new CuentaCorriente(dni, nombre, dinero);

		
		//Creamos bucle do while
		do {
			
			//Imprimimos la funcion mostarMenu
			mostrarMenu();

			//Escribimos ops
			ops = sc.nextInt();
			
			//Imprimimos la funcion elegirOpsciones
			elegirOpciones(ops, c1);

			//El bucle se termina si ops es 4
		} while (ops != 4);
		
		//Imprimimos adios
		System.out.println("Adios");
		
		//Cerramos scanner
		sc.close();
	}

	/**
	 * Funcion que realiza operaciones segun la opcion que elija el usuario
	 * @param ops Numero entero que indica el caso de los switch
	 * @param c1 Objeto que permite llamar funciones de su clases
	 */
	public static void elegirOpciones(int ops, CuentaCorriente c1) {
		double dinero;
		switch (ops) {

		case 1:
			System.out.println("Inserte el dinero a sacar");

			dinero = sc.nextDouble();

			if (c1.sacarDinero(dinero)) {
				System.out.println("Transaccion realizada");
			} else {
				System.out.println("Transaccion cancelada, no hay suficiente saldo");
			}
			break;
		case 2:
			System.out.println("Inserte la cantidad de dinero a ingresar");

			dinero = sc.nextDouble();

			c1.ingresarDinero(dinero);
			break;
		case 3:
			c1.mostrarInformacion();
			break;
		case 4:
			System.out.println("Saliendo de la cuenta corriente");
			break;
		default:
			System.out.println("Esta opcion no existe");

		}
	}

	/**
	 * Funcion que muestra el menu
	 */
	public static void mostrarMenu() {
		System.out.println("------------------------------------------\n");
		System.out.println("Inserte que opcion vas a realizar");
		System.out.println("1. Sacar dinero");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Mostrar informacion");
		System.out.println("4. Salir de la cuenta corriente");
		System.out.println("------------------------------------------");
	}

}
