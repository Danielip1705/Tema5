package ej2crud;

/**
 * Esta clase gesticial que representa los articulos de un almacen Estos
 * articulos contaran con un codigo unico,una descripcion, el precio sin IVA,
 * precio con IVA, y el stock
 */
public class Gesticial {
	/**
	 * Cadena que contiene el codigo del articulo
	 */
	private String codigo;

	/**
	 * Cadena que contiene la descripcion del articulo
	 */
	private String descripcion;

	/**
	 * Numero decimal que contiene el precio de la compra
	 */
	private double precioCompra;

	/**
	 * Numero decimal que contiene el preco de la venta
	 */
	private double precioVenta;

	/**
	 * Numero entero que contiene el stock del articulo
	 */
	private int stock;

	/**
	 * Constructor sin parametros
	 */
	public Gesticial() {
		this.codigo = "";
		this.descripcion = "";
		this.precioCompra = 0.0;
		this.precioVenta = 0.0;
		this.stock = 0;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo       cadena que contiene el codigo del articulo
	 * @param descripcion  Cadena que contiene la descripcion del articulo
	 * @param precioCompra Numero decimal que contiene el precio de la compra
	 * @param precioVenta  Numero decimal que contiene el precio de la venta
	 * @param stock        Numero entero que contiene el numero de articulos
	 *                     almacenados
	 */
	public Gesticial(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if (codigo != null && !codigo.equals("")) {
			this.codigo = codigo;
		}
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
		if (stock >= 0) {
			this.stock = stock;
		}
	}

	/**
	 * Get que muestra el codigo
	 * 
	 * @return El codigo del articulo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Set que modifica el codigo
	 * 
	 * @param codigo Cadena que contiene el codigo del articulo
	 */
	public void setCodigo(String codigo) {
		if (codigo != null && !codigo.equals("")) {
			this.codigo = codigo;
		}
	}

	/**
	 * Get que muestra la descripcion del articulo
	 * 
	 * @return La descipcion del articulo
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Set que modifica la descripcion del articulo
	 * 
	 * @param descripcion Cadena que contiene la descripcion del articulo
	 */
	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	/**
	 * get Que muestra el el precio de la compra del articulo
	 * 
	 * @return Precio de la compra del articulo
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * Set que modifica el precio de la compra
	 * 
	 * @param precioCompra Numero decimal que contiene el precio de la compra
	 */
	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	/**
	 * Get que muestra el precio de la venta del articulo
	 * 
	 * @return Precio de la venta del articulo
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Set que modifica el precio de la venta
	 * 
	 * @param precioVenta Numero decimal que contiene el precio de la venta
	 */
	public void setPrecioVenta(double precioVenta) {
		if (this.precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
	}

	/**
	 * Get que muestra la cantidad almacenada
	 * 
	 * @return Stock almacenado del articulo
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Set que modifica el precio del stock
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		if (this.stock > 0) {
			this.stock = stock;
		}
	}

	/**
	 * Metodo toString que devuelve una cadena con la informacion del ariculo en este formato:
	 * Codigo: 123A
	 * Descripcion: .....
	 * ...
	 * @return Cadena que contiene la informacion de los articulos
	 */
	@Override
	public String toString() {
		String cadena = "Codigo: " + this.codigo + "\nDescripcion: " + this.descripcion + "\nPrecio de compra: "
				+ this.precioCompra + "\nPrecio de venta: " + this.precioVenta + "\nStock: " + this.stock;

		return cadena;

	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Gesticial ges = (Gesticial) obj;
		
		if(this.codigo==ges.codigo) {
			iguales = true;
		}
		
		return iguales;
	}

}
