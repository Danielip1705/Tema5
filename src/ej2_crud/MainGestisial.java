package ej2_crud;

import java.util.Scanner;

public class MainGestisial {

	public static void main(String[] args) {
		String codigo;
		String descripcion;
		double compra;
		double venta;
		int stock;
		int ops=0;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			menu();
			
			ops = sc.nextInt();
			sc.nextLine();
			
			switch(ops) {
			case 1:
				ArrayGestisimal.listado();
				break;
			case 2:
				System.out.println("Registro de articulos");
				System.out.println("Indique el codigo del articulo");
				codigo=sc.nextLine();
				System.out.println("Indique la descripcion del articulo");
				descripcion = sc.nextLine();
				System.out.println("Indique el precio de compra del articulo");
				compra = sc.nextDouble();
				sc.nextLine();
				System.out.println("Indique el precio de venta del articulo");
				venta = sc.nextDouble();
				sc.nextLine();
				System.out.println("Indique el stock del articulo");
				stock = sc.nextInt();
				sc.nextLine();
				if(ArrayGestisimal.altaArticulo(codigo, descripcion, compra, venta, stock)) {
					System.out.println("Articulo añadido");
				} else {
					System.out.println("Lista de articulos llena");
				}
				break;
			case 3:
				System.out.println("Indique el codigo del articulo que quiere eliminar");
				codigo=sc.nextLine();
				
				if(ArrayGestisimal.bajaArticulo(codigo)) {
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
				if(ArrayGestisimal.modificar(codigo, descripcion, compra, venta)) {
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
				ArrayGestisimal.entradaMercancia(codigo, stock);
				break;
			case 6:
				System.out.println("Inserte el codigo");
				codigo = sc.nextLine();
				System.out.println("Inserte la salida de mercancia");
				stock = sc.nextInt();
				sc.nextLine();
				ArrayGestisimal.salidaMercancia(codigo, stock);
				break;
			case 7: 
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Esta opcion no existe");	
			}
		}while(ops!=7);
		
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
