package ej1;

import java.util.Scanner;

public class Main1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//Creamos la variables para utilizar el programa
		int ops;
		String nombre, dni;
		double dinero;

		//Impri
			System.out.println("Inserte su dni");

			dni = sc.nextLine();

			System.out.println("Inserte el nombre");

			nombre = sc.nextLine();

			System.out.println("Inserte el dinero");

			dinero = sc.nextDouble();

			CuentaCorriente c1 = new CuentaCorriente(dni, nombre, dinero);

			CuentaCorriente c2 = new CuentaCorriente(dni,dinero);
		
		
		
		
		do {
			
			mostrarMenu();
			
			ops = sc.nextInt();
			
		elegirOpciones(ops, c1);
		
		}while(ops!=4);
		
		System.out.println("Adios");
		
		sc.close();
	}

	public static void elegirOpciones(int ops, CuentaCorriente c1) {
		double dinero;
		switch(ops) {
		
		case 1:
			System.out.println("Inserte el dinero a sacar");
			
			dinero = sc.nextDouble();
			
			if(c1.sacarDinero(dinero)) {
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
