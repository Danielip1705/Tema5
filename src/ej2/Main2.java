package ej2;

import java.util.Scanner;

import ej2.Libro.Genero;

public class Main2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		//Creamos la variable que se van a utilizar en el programa
		String titulo;
		String autor;
		String genero;
		int ejemplares;
		int prestados;
		int ops=0;
		Libro lib; 
		Libro lib1;
		
		lib = crearLibro();
		
		lib1 =crearLibro1();
		//Creamos bucle do while
		do {
			
			//Imprimimos menu
			imprimirMenu();
			
			//Escribimos ops
			ops = sc.nextInt();
			
			//Insertamos la funcion elegirOpciones
			elegirOpciones(ops, lib);	
			
			//El bucle termina si ops es igual que 3
		}while(ops!=3);
		
		//Cerramos scanner 
		sc.close();
		
	}
	public static Libro crearLibro1() {
		String titulo;
		String autor;
		String genero;
		int ejemplares;
		int prestados;
		Libro lib1;
		//Imprimimos en consola que inserte el nombre del libro
				System.out.println("Inserte el nombre del libro");
				
				//Escribimos titulo
				titulo = sc.nextLine();
				
				//Imprimimos en consola que inserte el autor del libro
				System.out.println("Inserte el autor del libro");
				
				//Escribimos autor
				autor = sc.nextLine();
				
				System.out.println("Inserte el genero del libro que has elegido ");
				System.out.println("[Narrativo, Lírico, Dramático, Didáctico y Poético]");
				genero = sc.nextLine();
				
				//Imprimimos en consola que inserte el numero de ejemplares
				System.out.println("Inserte el numero de ejemplares que tiene el libro");
				
				//Escribimos ejemplares
				ejemplares = sc.nextInt();
				sc.nextLine();
				//Imprimimos en consola que nos inserte el numero de libros que se han insertados
				System.out.println("Inserte el numero de libros que se han prestados");
				//Escribimos prestados
				prestados = sc.nextInt();
				sc.nextLine();
				lib1 = new Libro(titulo,autor,Genero.valueOf(genero),ejemplares,prestados);
				return lib1;
	}
	public static Libro crearLibro() {
		String titulo;
		String autor;
		String genero;
		int ejemplares;
		int prestados;
		Libro lib;
		//Imprimimos en consola que inserte el nombre del libro
		System.out.println("Inserte el nombre del libro");
		
		//Escribimos titulo
		titulo = sc.nextLine();
		
		//Imprimimos en consola que inserte el autor del libro
		System.out.println("Inserte el autor del libro");
		
		//Escribimos autor
		autor = sc.nextLine();
		
		System.out.println("Inserte el genero del libro que has elegido ");
		System.out.println("[Narrativo, Lírico, Dramático, Didáctico y Poético]");
		genero = sc.nextLine();
		
		//Imprimimos en consola que inserte el numero de ejemplares
		System.out.println("Inserte el numero de ejemplares que tiene el libro");
		
		//Escribimos ejemplares
		ejemplares = sc.nextInt();
		sc.nextLine();
		//Imprimimos en consola que nos inserte el numero de libros que se han insertados
		System.out.println("Inserte el numero de libros que se han prestados");
		//Escribimos prestados
		prestados = sc.nextInt();
		sc.nextLine();
		//Creamos el objeto con el constructor con parametros para inicializarlos
		lib = new Libro(titulo,autor,Genero.valueOf(genero),ejemplares,prestados);
		return lib;
	}
	/**
	 * Funcion que nos deja elegir opciones para realizar diferentes operaciones
	 * @param ops Numero entero que sera el que elija la opcion a realizar
	 * @param lib Objeto con parametros de la clase Libro
	 */
	public static void elegirOpciones(int ops, Libro lib) {
		//Creamos switch teniendo segun ops
		switch (ops) {
		
		//En el caso 1
		case 1:
			//Declaramos con if que si el resultado de la funcion prestamos es true
			// se realiza el prestamos
			if(lib.prestamo()) {
				System.out.println("Realizando prestamo...");
				System.out.println("Prestamo realizado");
				
				// Y si no, no se realiza el prestamos
			} else {
				System.out.println("Realizando prestamo...");
				System.out.println("No ha sido posible realizar el prestamo, no hay suficientes ejemplares");
			}
			
			//Rompemos sel caso 1
			break;
			
			//En el caso 2
		case 2:
			
			//Declaramos con if que si el resulado de devolucion es true
			//se realiza la devolucion
			if(lib.devolucion()) {
				System.out.println("Realizando devolucion...");
				System.out.println("Devolucion realizada");
				
				//Y si no, no se raliza la devolucion
			} else {
				System.out.println("Realizando devolucion...");
				System.out.println("No ha sido posible realizar la devolucion, no hay libros prestados para devolver");
			}
			
			//Rompemos el caso 2
			break;
			
			//En el caso 3
		case 4:
			
			//Imprimimos en consola que nos salimos del programa
			System.out.println("Saliendo del programa");
			System.out.println("Gracias por utilizar este programa");
			
			//Rompemos caso 3
			break;
		case 3:
			System.out.println(lib);
			break;
			//Y si ops no es 1,2 o 3
			default:
				
				//Que nos imprima que esta opcion no existe
				System.out.println("Esta opcion no existe");
		}
	}
	/**
	 * Funcion que imprime un menu
	 */
	public static void imprimirMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("DEVOLUCIONES Y PRESTAMOS DE LIBROS");
		System.out.println("Inserte que opcion vas a realizar");
		System.out.println("1. Prestamo");
		System.out.println("2. Devolución");
		System.out.println("3. Listado");
		System.out.println("4. Salir del programa");
		System.out.println("-----------------------------------------");
	}

}
