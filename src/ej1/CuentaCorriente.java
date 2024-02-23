package ej1;

/**
 * Clase donde se realizara metodos y atributos para simular un banco
 */
public class CuentaCorriente {

	/**
	 * Cadena donde se almacena el dni del titular
	 */
	private String dni;

	/**
	 * Cadena donde se almacena el nombre del titular
	 */
	private String nombre;

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
		super();
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
	 * @param nombre Cadena introducida por el usuario que alamcenara el nombre del titular
	 * @param saldo  Decimal que almacenara el dinero del titular, siguiendo ciertas
	 *               codiciones (que no sea menor que cero)
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();

		if (!dni.equals(null) && !dni.equals("")) {

			this.dni = dni;

		}
		if (!nombre.equals(null) && !nombre.equals("")) {

			this.nombre = nombre;

		}
		if (saldo >= 0) {
			this.saldo = saldo;

		}
	}

	public boolean sacarDinero(double cantidad) {

		boolean seSaca= false;
		
		if (cantidad > saldo) {

		} else {
			seSaca=true;
			saldo -= cantidad;
		}
		
		return seSaca;
	}

	public void ingresarDinero(double ingreso) {

		System.out.println("Saldo ingresado: " + ingreso);

		saldo += ingreso));
	}

	public void mostrarMenu() {

		System.out.println("Titular: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Saldo: " + saldo);
	}

}
