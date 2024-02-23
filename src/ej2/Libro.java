package ej2;

public class Libro {

	String título="";
	String autor="";
	int ejemplares=0;
	int prestados=0;
	
	public Libro(String título, String autor, int ejemplares, int prestados) {
		super();
		this.título = título;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	public Libro() {
		super();
	}
	
	public boolean prestamo () {
		
		boolean prestado=false;
		
		if(prestados>0) {
			
			prestado = true;
		} 
		return prestado;
	}
	
	public boolean devuelto() {
		boolean devuelto=true;
		
		if( = false) {
			
		}
	}
	
}
