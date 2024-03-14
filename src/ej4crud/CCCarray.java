package ej4crud;

public class CCCarray {

	static CCC[] cuenta = new CCC[30];

	public static void listadoCuenta() {

		for (CCC valor : cuenta) {
			if (valor != null) {
				System.out.println(valor);
			}
		}
	}

	public static boolean nuevaCuenta(CCC cun) {
		boolean añadido = false;
		int i = 0;

		while (i < cuenta.length && cuenta[i] != null) {
			i++;
		}
		if (i < cuenta.length) {
			cuenta[i] = cun;
			añadido = true;
		}

		return añadido;

	}
	
	public static boolean eliminarCuenta(CCC cun) {
		boolean eliminado = false;
		int i=0;
		
		while(i< cuenta.length&& cuenta[i].getDni()==dni) {
			i++;
		}
		
		if(i<cuenta.length) {
			
			cuenta[i]=null;
			
			eliminado = true;
		}
		
		return eliminado;
		
	}

	public static int buscarTitular(CCC c) {
		int i = 0;
		int pos = -1;

		while (i < cuenta.length && pos == -1) {

			if (cuenta[i] != null && cuenta[i].equals(c)) {
				pos = i;
			}
			i++;
		}

		return pos;

	}
}
