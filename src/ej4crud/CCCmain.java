package ej4crud;

import java.util.Scanner;

public class CCCmain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String dni = "";
		String nombre = "";
		double saldo;
		int ops = 0;
		CCC cun;

		do {

			System.out.println("Inserte una opcion");
			System.out.println("1. Listado");
			System.out.println("2. Añadir");
			System.out.println("3. Eliminar");
			System.out.println("4. Ingresar dinero");
			System.out.println("5. Sacar dinero");
			System.out.println("6. Salir");
			ops = sc.nextInt();
			sc.nextLine();

			switch (ops) {
			case 1:
				CCCarray.listadoCuenta();
				break;
			case 2:
				System.out.println("Inserte el dni del titular");
				dni = sc.nextLine();
				System.out.println("Inserte el nombre del titular");
				nombre = sc.nextLine();
				System.out.println("Inserte el saldo");
				saldo = sc.nextDouble();
				sc.nextLine();
				cun = new CCC(dni, nombre, saldo);
				if (CCCarray.nuevaCuenta(cun)) {
					System.out.println("Cuenta añadida");
				} else {
					System.out.println("Error");
				}
				break;
			case 3:
				System.out.println("Inserte el dni de la cuenta que quiere eliminar");
				dni = sc.nextLine();
				System.out.println("Inserte el nombre de la cuenta que quiere eliminar");
				nombre = sc.nextLine();
				System.out.println("Inserte el saldo de la cuenta que quiere eliminar");
				saldo = sc.nextDouble();
				cun = new CCC(dni,nombre,saldo);
				if(CCCarray.eliminarCuenta(cun)) {
					
					System.out.println("Eliminado con exito");
				} else {
					System.out.println("Error");
				}
				break;
			}

		} while (ops != 6);

	}

}
