package ej1crud;

public class Alumno {

	/**
	 * Cadena que contiene el nombre del alumno
	 */
	private String nombre = "";

	/**
	 * Numero decimal que contiene la nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor sin parametros
	 */
	public Alumno() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre    Cadena que contiene el nombre del alumno
	 * @param notaMedia Numero decimal que contiene la nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Get donde devolvera el resultado del atributo nombre
	 * @return Cadena que contiene el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set donde modifica el nombre del alumno
	 * @param nombre Cadena que contiene el nombre del alumno
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
	}
	
	/**
	 * Get que muestra la nota media del alumno
	 * @return Numero decimal que contiene la nota media del alumno
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Set que modifica la nota media del alumno
	 * @param notaMedia Numero decimal modificado que contiene la nota media del alumno
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	@Override
	public String toString() {
		String cadena ="";
		cadena += "Nombre: " +this.nombre+"\n";
		cadena += "Nota media: " +this.notaMedia;
		return cadena;
	}
	
	
	

}
