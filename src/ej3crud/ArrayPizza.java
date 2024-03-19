package ej3crud;

public class ArrayPizza {

	/**
	 * Array estatico que contiene 50 objetos de la clase Pizza
	 */
	static Pizza[] pizzas = new Pizza[50];

	/**
	 * Funcion que imprime solo las pocisiones con objetos en el array
	 */
	public static void listadoPizzas() {
		for (Pizza piz : pizzas) {
			if (piz != null) {
				System.out.println(piz);
			}
		}
	}

	/**
	 * Funcion que añade un objeto con valores en el array
	 * 
	 * @param piz Objeto con paramtros ya definidos de la clase Pizza
	 * @return Booleano que devuelve true o false si hay espacio en el array o no
	 */
	public static boolean nuevoPedido(Pizza piz) {
		boolean añadido = false;
		int i = 0;

		while (i < pizzas.length && pizzas[i] != null) {
			i++;
		}

		if (i < pizzas.length) {
			pizzas[i] = piz;
			añadido = true;
		}

		return añadido;
	}

	/**
	 * Funcion que modifica el atributo estado a Servido segun el codigo pasado como
	 * parametro
	 * 
	 * @param codigo Numero entero que representa el codigo
	 * @return
	 */
	public static boolean pizzaServida(Pizza piz) {
		boolean servido = false;
		int pos = buscarPizzas(piz);
		if (pos != -1) {
			pizzas[pos].setEstado("SERVIDA");
			servido = true;
		}

		return servido;
	}
	/**
	 * Funcion que busca en el array el codigo de las pizzas segun el contenido del parametro de entrada
	 * @param piz Objeto ha buscar en el array
	 * @return Numero entero que contiene la posicion del array del objeto a buscar
	 */
	private static int buscarPizzas(Pizza piz) {
		int i = 0;
		int pos = -1;

		while (i < pizzas.length && pos == -1) {

			if (pizzas[i] != null && pizzas[i].equals(piz)) {
				pos = i;
			}
			i++;
		}
		return pos;

	}

}
