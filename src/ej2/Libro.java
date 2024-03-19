package ej2;

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

	 enum Genero {NARRATIVO,LÍRICO,DRAMÁTICO,POÉTICO};
	
	private Genero genero;
	/**
	 * Constructor sin parametros
	 */
	public Libro() {

	}

	/**
	 * Constructor con parametros
	 */
	public Libro(String titulo, String autor,Genero genero, int ejemplares, int prestados) {
		if (titulo != null && !titulo.equals("")) {
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
		
		if(genero!=null) {
			this.genero = genero;
		}
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
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

	@Override
	public String toString() {
		String cadena ="";
		cadena += "Titulo: " + this.titulo + "\n";
		cadena += "Autor: " + this.autor+"\n";
		cadena += "Genero: "+this.genero + "\n";
		cadena += "Ejemplares: " +this.ejemplares+"\n";
		cadena += "Prestados: "+this.prestados+"\n";
		return cadena;
	}

	
}
