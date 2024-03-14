package ej4crud;

import java.util.Objects;

public class CCC {
	/**
	 * Cadena donde se almacena el dni del titular
	 */
	private String dni = "";

	/**
	 * Cadena donde se almacena el nombre del titular
	 */
	private String nombre = "";

	/**
	 * Decimal donde se almacenara el dinero que tiene cada titular
	 */
	private double saldo;

	/**
	 * Constructor que almacenara lo datos introducidos en los atributos
	 * 
	 * @param dni   Cadena que almacenara el dni del titular, siguiendo ciertas
	 *              condiciones (que no sea nulo y que no sea cadena vacia)
	 * @param saldo Decimal que almacenara el dinero del titular, siguiendo ciertas
	 *              codiciones (que no sea menor que cero)
	 */
	public CCC(String dni, double saldo) {

		if (!dni.equals(null) && !dni.equals("")) {

			this.dni = dni;

		}
		if (saldo >= 0) {

			this.saldo = saldo;

		}
	}

	/**
	 * Constructor que almacena los datos introducidos en los atributos
	 * 
	 * @param dni    Cadena que almacenara el dni del titular, siguiendo ciertas
	 *               condiciones (que no sea nulo y que no sea cadena vacia)
	 * @param nombre Cadena introducida por el usuario que alamcenara el nombre del
	 *               titular
	 * @param saldo  Decimal que almacenara el dinero del titular, siguiendo ciertas
	 *               codiciones (que no sea menor que cero)
	 */
	public CCC(String dni, String nombre, double saldo) {

		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public CCC(String dni) {
		this.dni=dni;
	}
	/**
	 * Set donde muestra el atributo nombre
	 * 
	 * @return Atributo que contiene el nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set donde modifica el atributo nombre
	 * 
	 * @param nombre Atributo que contiene el nombre del titular
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Get que muestra el saldo del titular
	 * 
	 * @return Numero entero que contiene el saldo del titular
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Set que modifica el saldo del titular
	 * 
	 * @param saldo Atributo que contiene el saldo del titular
	 */
	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * get Que muestra el dni del titular
	 * 
	 * @return Cadena que contiene el dni del titular
	 */
	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		String cadena="";
		
		cadena += "DNI: " + this.dni+ "\n";
		cadena += "Nombre: " + this.nombre+ "\n";
		cadena += "Saldo: " + this.saldo+ "\n";
		
		return cadena;
	}


	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;
		
		CCC cuenta = (CCC) obj;
		
		if(this.dni==cuenta.dni) {
			
			iguales = true;
		}
		
		return iguales;
	}

	
}
