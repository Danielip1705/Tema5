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
		if (this.nombre != null && !this.nombre.equals("")) {
			this.nombre = nombre;
		}
		if (this.notaMedia >= 0 && this.notaMedia <= 10) {
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

	public void setNombre(String nombre) {
		if (this.nombre != null && !this.nombre.equals("")) {
			this.nombre = nombre;
		}
		
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		if (this.notaMedia >= 0 && this.notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	
	

}
