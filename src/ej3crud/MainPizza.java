package ej3crud;

import java.util.Scanner;

public class MainPizza {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos las variables que se va a usar en el programa
		int codigo;
		String tamaño;
		String tipo;
		Pizza piz;
		int ops = 0;

		// Creamos bucle do while
		do {
			// Imprimimos la funcion menu
			menu();
			// Escribimos ops
			ops = sc.nextInt();
			// Limpiamos buffer
			sc.nextLine();
			// Declaramos switch teniendo en cuenta la variable ops
			switch (ops) {
			case 1:
				// Imprimimos la funcion listadoPizzas
				ArrayPizza.listadoPizzas();
				break;
			case 2:
				//Inicializamos el objeto pizzas con la funcion crearPizzas
				piz = crearPizza();
				
				//Declaramos con if que si el resultado de la funcion nuevoPedido es true
				if (ArrayPizza.nuevoPedido(piz)) {
					//Imprimimos en consola que el pedido
					System.out.println("Pedido añadido");
					//y si no
				} else {
					//Imprimimos en consola que no se ha podido añadir el pedido
					System.out.println("No se puede añadir el pedido");
				}
				break;
			case 3:
				//Imprimimos en consola que nos inserte el codigo de la pizza servida
				System.out.println("Inserte el codigo de la pizza servida");
				//Escribimos codigo
				codigo = sc.nextInt();
				//Limpiamos buffer
				sc.nextLine();
				//Incializamos pizza con la variable codigo
				piz = new Pizza(codigo);
				//Declaramos con if que si el resultado de la funcion pizzaServida es true
				if (ArrayPizza.pizzaServida(piz)) {
					//Que imprima que la pizza esta servida
					System.out.println("Pizza servida");
					//y si no
				} else {
					//que imprima que la pizza no esta servida
					System.out.println("No existe esa pizza");
				}
				break;
			case 4:
				//Imprimimos que se esta saliendo del programa
				System.out.println("Saliendo del programa");
			}
			//se termina el bucle si ops es igual que 4
		} while (ops != 4);

		//cerramos scanner
		sc.close();
	}
	/**
	 * Funcion que declara las variables para inicializar el objeto
	 * @return Objeto 
	 */
	public static Pizza crearPizza() {
		int codigo;
		String tamaño;
		String tipo;
		Pizza piz;
		System.out.println("Inserte el codigo de la pizza");
		codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Eliga el tamaño:");
		System.out.println("\t[Mediana]\t[Familiar]");
		tamaño = sc.nextLine();
		System.out.println("Eliga el tipo:");
		System.out.println("\t[Margarita]\t[CuatroQuesos]\t[Funghi]");
		tipo = sc.nextLine();
		piz = new Pizza(codigo, tamaño, tipo);
		return piz;
	}

	/**
	 * Funcion que muestra un menu
	 */
	public static void menu() {
		System.out.println("Eliga que opcion quiere elegir");
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
	}

}
