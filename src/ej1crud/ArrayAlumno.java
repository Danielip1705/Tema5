package ej1crud;

public class ArrayAlumno {

	/**
	 * Creamos lista con el objeto alumno y de longitud 30
	 */
	public static Alumno[] alumnos = new Alumno[30];

	/**
	 * Funcion que imprime los valores del array donde haya valores
	 */
	public static void imprimirAlumnos() {
		for (Alumno alumn : alumnos) {
			if (alumn != null) {
				System.out.println(alumn);
			}
		}
	}

	/**
	 * Funcion que inserta en el array un nuevo alumno
	 * 
	 * @param nombre Cadena que contiene el nombre del alumno
	 * @param nota   Numero decimal que contiene la nota media del alumno
	 * @return Booleano true o false dependiedo si hay espacio en el array (true) o
	 *         si esta lleno (false)
	 */
	public static boolean nuevoAlumno(String nombre, double nota) {
		Alumno alumn = new Alumno(nombre, nota);
		int i = 0;
		boolean anyadido = false;

		while (i < alumnos.length && alumnos[i] != null) {
			i++;
		}

		if (i < alumnos.length) {
			alumnos[i] = alumn;
			anyadido = true;
		}

		return anyadido;
	}

	/**
	 * Funcion que modifica la nota del alumno
	 * 
	 * @param alumno Cadena que contiene el nombre del alumno a buscar en el array
	 * @param nota   Numero decimal que contiene la nota media a modificar
	 * @return Booleano true o false dependiedo si se ha encontrado el alumno (true)
	 *         o si no existe (false)
	 */
	public static boolean modificaAlumno(String alumno, double nota) {
		boolean modificado = false;
		int i = buscaAlumno(alumno);

		if (i < alumnos.length) {
			alumnos[i].setNotaMedia(nota);
			modificado = true;
		}

		return modificado;
	}

	/**
	 * Funcion que elimina un alumno insetando el nombre
	 * 
	 * @param alumno Cadena que contiene el nombre del alumno que se va a eliminar
	 * @return Booleano true o false dependiedo si se ha encontrado el alumno (true)
	 *         o si no existe (false)
	 */
	public static boolean eliminaAlumno(String alumno) {
		boolean eliminado = false;
		int i = buscaAlumno(alumno);

		if (i < alumnos.length) {
			alumnos[i] = null;
			eliminado = true;
		}

		return eliminado;
	}

	/**
	 * Funcion que busca en el array un alumno que coincida con el nombre pasado
	 * como parametro
	 * 
	 * @param alumno Cadena que contiene el nombre del alumno a buscar
	 * @return Numero entero que contiene el la posicion del array donde se
	 *         encuentra el alumno a buscar
	 */
	private static int buscaAlumno(String alumno) {
		int i = 0;

		while (i < alumnos.length && (alumnos[i] == null || !alumnos[i].getNombre().equals(alumno))) {
			i++;
		}
		return i;
	}

}
