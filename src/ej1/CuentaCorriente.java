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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public boolean sacarDinero(double cantidad) {

		boolean seSaca = false;

		if (cantidad <= this.saldo) {

			seSaca = true;
			this.saldo -= cantidad;

		}

		return seSaca;
	}

	public void ingresarDinero(double ingreso) {

		if (ingreso > 0) {
			this.saldo += ingreso;
		}

	}

	public void mostrarInformacion() {
		System.out.println("**********************************\n");
		System.out.println("Titular: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("**********************************");
	}

}
