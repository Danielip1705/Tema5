package ej2_crud;

public class ArrayGestisimal {

	public static Gesticial[] articulos = new Gesticial[20];

	public static void listado() {
		for (Gesticial ges : articulos) {
			if (ges != null) {
				System.out.println(ges);
			}
		}
	}

	public static boolean altaArticulo(String codigo, String desc, double compra, double venta, int stock) {
		int i = 0;
		boolean añadido = false;
		Gesticial art = new Gesticial(codigo, desc, compra, venta, stock);

		while (i < articulos.length && articulos[i] != null) {
			i++;
		}

		if (i < articulos.length) {
			articulos[i] = art;
			añadido = true;
		}
		return añadido;
	}

	public static boolean bajaArticulo(String codigo) {
		boolean eliminado = false;
		int i = buscarArticulo(codigo);

		if (i < articulos.length) {
			articulos[i] = null;
			eliminado = true;
		}

		return eliminado;
	}

	public static boolean modificar(String codigo, String desc, double compra, double venta) {
		boolean modificado = false;
		int i = buscarArticulo(codigo);

		if (i < articulos.length) {
			articulos[i].setDescripcion(desc);
			articulos[i].setPrecioCompra(compra);
			articulos[i].setPrecioVenta(venta);
			modificado = true;
		}
		i++;

		return modificado;
	}

	public static void entradaMercancia(String codigo, int stock) {

		int i = buscarArticulo(codigo);

		if (i < articulos.length) {
			articulos[i].setStock(articulos[i].getStock() + stock);

		}
	}

	public static void salidaMercancia(String codigo, int stock) {
		int i = buscarArticulo(codigo);

		if (i < articulos.length) {
			articulos[i].setStock(articulos[i].getStock() - stock);
		}
	}

	public static int buscarArticulo(String codigo) {
		int i = 0;
		while (i < articulos.length && (articulos[i] == null || !articulos[i].getCodigo().equals(codigo))) {
			i++;
		}
		return i;
	}

}
