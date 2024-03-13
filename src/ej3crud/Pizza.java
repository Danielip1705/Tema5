package ej3crud;

public class Pizza {

	/**
	 * Numero entero que contiene el codigo de la pizza
	 */
	private int codigo;

	/**
	 * Cadena que contiene el tamaño de la pizza
	 */
	private String tamaño = "";

	/**
	 * Cadena que contiene que tipo de pizza es
	 */
	private String tipo = "";

	/**
	 * Cadena que contiene el estado de la pizza
	 */
	private String estado = "pedida";

	/**
	 * Constructor sin parametros
	 */
	public Pizza() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo Numero entero que contiene el codigo
	 * @param tamaño Cadena que contiene el tamaño de la pizza
	 * @param tipo   Cadena que contiene el tipo de la pizza
	 * @param estado Cadena que contiene el estado de la pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (tamaño != null && !tamaño.equals("") && tamaño.equalsIgnoreCase("Medianda")
				&& tamaño.equalsIgnoreCase("Familiar")) {
			this.tamaño = tamaño;
		}
		if (tipo != null && !tipo.equals("") && tipo.equalsIgnoreCase("Margarita")
				&& tipo.equalsIgnoreCase("CuatroQuesos") && tipo.equalsIgnoreCase("Funghi")) {
			this.tipo = tipo;
		}

	}

	/**
	 * Get que muestra el codigo de la pizza
	 * 
	 * @return Numero entero que representa el codigo de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Set que modifica el codigo de la pizza
	 * 
	 * @param codigo Numero entero modificado que representa el codigo de la pizza
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Get que muestra el tamaño de la pizza
	 * 
	 * @return Cadena que muestra el tamaño de la pizza (Mediana o Familiar)
	 */
	public String getTamaño() {
		return tamaño;
	}

	/**
	 * Set que modifica el tamaño de la pizza
	 * 
	 * @param tamaño Cadena modificada que representa el tamaño de la pizza
	 */
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * Get que muestra el tipo de la pizza
	 * 
	 * @return Cadena que contiene el tipo de la pizza(Margarita, CuatroQuesos o
	 *         Funghi)
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Set que modifica el tipo de la pizza
	 * 
	 * @param tipo Cadena modificada que muestra 3 opciones(Margarita, CuatroQuesos
	 *             o Funghi)
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Get que muestra el estado de la pizza
	 * 
	 * @return Cadena que contiene el estado de la pizza(Pedida o Servida)
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Set que modifica el estado de la pizza
	 * 
	 * @param estado Cadena modificada que contiene el estado de la pizza(Pedida o
	 *               servida)
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		String cadena="";
		cadena+= "Codigo: "+this.codigo+"\n";
		cadena+= "tamaño: "+this.tamaño+"\n";
		cadena+= "tipo: "+this.tipo+"\n";
		cadena+= "estado: "+this.estado+"\n";
		
		return cadena;
	}

	
}
