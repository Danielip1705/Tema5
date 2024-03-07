package ej4;

public class Articulo {

	/**
	 * Cadena que indica el nombre del articulo
	 */
	private String nombre;

	/**
	 * Numero con decimales que indica el precio del articulo
	 */
	private double precio;

	/**
	 * Numero decimal constante que indica el IVA
	 */
	public static final double IVA = 21;

	/**
	 * Numero entero que indica cuantos articulos quedan
	 */
	private int cuantosQuedan;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre        Cadena en la cual sera la inicializacion del atributo
	 *                      nombre
	 * @param precio        Predio con decimales en la cual sera la inicializacion
	 *                      del atributo precio
	 * @param cuantosQuedan Numero entero en la cual sera la inicializacion del
	 *                      atributo cuantosQuedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;

		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	/**
	 * Get que devuelve el atributo nombre
	 * @return Cadena que contiene el nombre del articulo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set que modifica el nombre del articulo
	 * @param nombre Cadena que contiene el nombre del articulo
	 */
	public void setNombre(String nombre) {
		if (nombre != null && nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	/**
	 * Get que devuelve el precio del articulo
	 * @return Numero decimal que contiene el precio del articulo
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Set que modifica el precio del articulo
	 * @param precio Numero decimal que contiene el precio del articulo
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;

		}
	}

	/**
	 * Get que devuelve un numero entero que contiene la cantidad de articulos
	 * @return numero entero que contiene la cantidad de articulos
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Set que modifica el atributo cuantosQuedan
	 * @param cuantosQuedan Numero entero que indica cuantos articulos quedan
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public static double getIva() {
		return IVA;
	}

	/**
	 * Funcion que Imprime la informacion del producto
	 */
	public void imprimirInformacion() {
		System.out.println("INFORMACION DEL PRODUCTO");
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("PRECIO: " + this.precio);
		System.out.println("CUANTOS QUEDAN: " + this.cuantosQuedan);
	}

	/**
	 * Funcion que devuelve el precio con el IVA incluido
	 * 
	 * @return Double con el precio + IVA
	 */
	public double getPVP() {

		return this.precio + (this.precio * (this.IVA / 100));
	}

	/**
	 * Funcion que devuelve el precio (con iva incluido)
	 * 
	 * @param descuento
	 * @return
	 */
	public double getPVPDescuento(double descuento) {

		double precio = getPVP();

		return precio - (precio * (descuento / 100));
	}

	/**
	 * Funcion que actualiza el atributo cuantosQuedan tras vender una cantidad ‘x’
	 * 
	 * @param cantidadVendido Cantidad de articulos que se van a vender
	 * @return Booleano que devuelve true o false segun la cantidad de articulos (si
	 *         hay o no)
	 */
	public boolean vender(int cantidadVendido) {
		boolean vendido = false;

		if (this.cuantosQuedan >= cantidadVendido) {
			this.cuantosQuedan -= cantidadVendido;
			vendido = true;
		}

		return vendido;
	}

	/**
	 * Funcion que actualiza el atributo cuantosQuedan tras almacenar una cantidad
	 * ‘x’
	 * 
	 * @param cantidadAlmacenar Cantidad de articulos que se va a almacenar
	 */
	public boolean almacenar(int cantidadAlmacenar) {

		boolean almacenado=false;
		if (cantidadAlmacenar > 0) {
			this.cuantosQuedan += cantidadAlmacenar;
			almacenado=true;
		}
		return almacenado;
	}
}
