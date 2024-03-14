package ej3crud;

import java.util.Scanner;

public class MainPizza {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int codigo;
		String tamaño;
		String tipo;
		Pizza piz;
		int ops=0;
		
		do {
			
			menu();
			ops = sc.nextInt();
			sc.nextLine();
			
			switch(ops) {
				case 1:
					ArrayPizza.listadoPizzas();
				break;
				case 2:
					
					System.out.println("Inserte el codigo de la pizza");
					codigo = sc.nextInt();
					sc.nextLine();
					System.out.println("Eliga el tamaño:");
					System.out.println("\t[Mediana]\t[Familiar]");
					tamaño = sc.nextLine();
					System.out.println("Eliga el tipo:");
					System.out.println("\t[Margarita]\t[CuatroQuesos]\t[Funghi]");
					tipo = sc.nextLine();
					piz = new Pizza(codigo,tamaño,tipo);
					
					if(ArrayPizza.nuevoPedido(piz)) {
						System.out.println("Pedido añadido");
					} else {
						System.out.println("No se puede añadir el pedido");
					}
				break;
				case 3:
					System.out.println("Inserte el codigo de la pizza servida");
					codigo = sc.nextInt();
					sc.nextLine();
					
					if(ArrayPizza.pizzaServida(codigo)) {
						System.out.println("Pizza servida");
					} else {
						System.out.println("No existe esa pizza");
					}
					break;
				case 4:
					System.out.println("Saliendo del programa");
			}
		}while (ops!=4);
		
		
		

	}
	public static void menu() {
		System.out.println("Eliga que opcion quiere elegir");
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
	}

}
