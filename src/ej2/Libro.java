package ej2;

import java.util.Random;
import java.util.Scanner;

public class Libro {

	private String titulo = "";
	private String autor = "";
	private int ejemplares = 0;
	private int prestados = 0;

	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if(titulo!=null && !titulo.endsWith("")) {
		this.titulo = titulo;
		}
		if(autor != null&&!autor.equals("")) {
			this.autor = autor;
		}
		if(ejemplares >0) {
		this.ejemplares = ejemplares;
		}
		if(prestados>0) {
		this.prestados = prestados;
		}
	}
	
	public boolean prestamo() {
		boolean prestado=false;
		
		
		return prestado;
	}

}
