package ej2;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase libro donde tendra atributos, constructores y funciones
 */
public class Libro {

	/**
	 * Cadena que contiene el titulo del libro
	 */
	private String titulo = "";

	/**
	 * Cadena que contiene el autor del libro
	 */
	private String autor = "";

	/**
	 * Numero entero que contiene el numero de ejemplares que tiene
	 */
	private int ejemplares = 0;

	/**
	 * Numero entero que contiene el numero de veces que se ha prestado un libro
	 */
	private int prestados = 0;

	/**
	 * Constructor sin parametros
	 */
	public Libro() {

	}

	/**
	 * Constructor con parametros
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.endsWith("")) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados > 0) {
			this.prestados = prestados;
		}
	}

	/**
	 * Funcion que aumenta el atributo prestado cada vez que se preste un libro
	 * @return Booleano true o false dependiedo si hay o no ejemplares
	 */
	public boolean prestamo() {
		boolean prestado = false;
		if (this.prestados < this.ejemplares) {
			prestado = true;
			this.prestados++;
		}

		return prestado;
	}

	/**
	 * Funcion que decrementa el atributo prsetado cada vez que se devuelva un libro
	 * @return Booleano true o false dependiedo si hay o no libros prestados
	 */
	public boolean devolucion() {
		boolean devuelto = false;

		if (this.prestados > 0) {
			devuelto = true;
			this.prestados--;
		}

		return devuelto;
	}

}
