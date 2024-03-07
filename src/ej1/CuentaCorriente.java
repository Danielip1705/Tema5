package ej1;

/**
 * Clase donde se realizara metodos y atributos para simular un banco
 */
public class CuentaCorriente {

	/**
	 * Cadena donde se almacena el dni del titular
	 */
	private String dni="";

	/**
	 * Cadena donde se almacena el nombre del titular
	 */
	private String nombre="";

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
	public CuentaCorriente(String dni, double saldo) {

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
	public CuentaCorriente(String dni, String nombre, double saldo) {

		this(dni, saldo);

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Set donde muestra el atributo nombre
	 * @return Atributo que contiene el nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set donde modifica el atributo nombre
	 * @param nombre Atributo que contiene el nombre del titular
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Get que muestra el saldo del titular
	 * @return Numero entero que contiene el saldo del titular
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Set que modifica el saldo del titular
	 * @param saldo Atributo que contiene el saldo del titular
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * get Que muestra el dni del titular
	 * @return Cadena que contiene el dni del titular
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Funcion que resta X cantidad al atributo saldo
	 * @param cantidad Numero decimal que restara al atributo saldo
	 * @return Booleano true o false dependiendo si hay suficiente saldo o no
	 */
	public boolean sacarDinero(double cantidad) {

		boolean seSaca = false;

		if (cantidad <= this.saldo) {

			seSaca = true;
			this.saldo -= cantidad;

		}

		return seSaca;
	}

	/**
	 * Funcion que suma X cantidad al atributo saldo
	 * @param ingreso Numero decimal que sumara al atributo saldo
	 */
	public void ingresarDinero(double ingreso) {

		if (ingreso > 0) {
			this.saldo += ingreso;
		}

	}

	/**
	 * Funcion que mostrara la informacion de los atributos del titular
	 */
	public void mostrarInformacion() {
		System.out.println("**********************************\n");
		System.out.println("Titular: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("**********************************");
	}

}
