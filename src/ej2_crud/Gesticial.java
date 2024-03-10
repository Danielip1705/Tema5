package ej2_crud;

public class Gesticial {
	private String codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;

	public Gesticial() {
        this.codigo = "";
        this.descripcion = "";
        this.precioCompra = 0.0;
        this.precioVenta = 0.0;
        this.stock = 0;
    }

    public Gesticial(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (this.codigo != null && !this.codigo.equals("")) {
			this.codigo = codigo;
		}
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (this.descripcion != null && !this.descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if (this.precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		if (this.precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (this.stock > 0) {
			this.stock = stock;
		}
	}

	@Override
	public String toString() {
		return "Codigo: " + this.codigo + "\nDescripcion: " + this.descripcion + "\nPrecio de compra: "
				+ this.precioCompra + "\nPrecio de venta: " + this.precioVenta + "\nStock: " + this.stock;

	}

}
