package ej1crud;

import java.util.Scanner;

public class MainAlumno {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);
		// Creamos las variables a utilizar en el programa
		int ops;
		String nombre;
		double nota;
		// Ceramos bucle do while
		do {
			// Imprimimos la funcion menu
			menu();
			// Escribimos ops
			ops = sc.nextInt();
			// Limpiamos buffer
			sc.nextLine();
			// Creamos switch teniendo en cuenta la variable ops
			switch (ops) {
			case 1:
				// Imprimir la lista de los alumnos
				ArrayAlumno.imprimirAlumnos();
				break;
			case 2:
				// Imprimimos en consola que inserte el nombre del alumno
				System.out.println("Introduzca el nombre del alumno:");
				// Escribimos nombre
				nombre = sc.nextLine();
				// Imprimimos en consola que inserte la nota media del alumno
				System.out.println("Introduzca la nota media del alumno:");
				// Escribimos nota
				nota = sc.nextDouble();
				// Limpiamos buffer
				sc.nextLine();
				// Declaramos con un if que si el resultado de la funcion nuevo alumno es true
				if (ArrayAlumno.nuevoAlumno(nombre, nota)) {
					// Imprimima en consola que se ha añadido correctamente
					System.out.println("Añadido correctamente");
					// Y si no
				} else {
					// Imprimimos en consola que la lista esta llena
					System.out.println("Array lleno");
				}
				// Rompemos case 2
				break;
			case 3: // Imprimimos en consola que inserte el nombre del alumno
				System.out.println("Introduzca el nombre del alumno:");
				// Escribimos nombre
				nombre = sc.nextLine();
				// Imprimios en consola que inserte la nota media del alumno
				System.out.println("Introduzca la nota media del alumno:");
				// Escribimos nota
				nota = sc.nextDouble();
				// Limpiamos buffer
				sc.nextLine();
				// Declaramos con if que si el resultado de la funcion modifica alumno es true
				if (ArrayAlumno.modificaAlumno(nombre, nota)) {
					// Que imprima en consola que el alumno ha sido modificado
					System.out.println("Alumno modificado correctamente");
					// Y si no
				} else {
					// Que imprima en consola que no se ha encontrado del alumno
					System.out.println("No se ha encontrado al alumno");
				}
				// Rompemos caso 3
				break;
			case 4:
				// Imprimimos en consola que inserte el nombre del alumno
				System.out.println("Introduzca el nombre del alumno:");
				// Escribimos nombre
				nombre = sc.nextLine();
				// Declaramos con if que si el resultado de la funcion eliminaAlumno es true
				if (ArrayAlumno.eliminaAlumno(nombre)) {
					// Imprimimos en consola que el alumno se ha eliminado
					System.out.println("Alumno eliminado correctamente");
					// Y si no
				} else {
					// Que el alumno no se ha encontrado
					System.out.println("Alumno no encontrado");
				}
				// Rompemos case 4
				break;
			case 5:
				// Imprimimos en consola que nos estamos salido del programa
				System.out.println("Saliendo del programa...");
			}
			// Terminamos el bucle si ops es igual que 5
		} while (ops != 5);

		// Cerramos scanner
		sc.close();
	}

	/**
	 * Funcion que muestra el menu
	 */
	public static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("==========");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.println("¿Qué opción quiere ejecutar?");
	}

}
