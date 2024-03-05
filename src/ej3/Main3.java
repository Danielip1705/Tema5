package ej3;

public class Main3 {

	public static void main(String[] args) {
		// Creamos dos objetos con la clase Punto con coordenadas (1,1) y (7,-5)
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(7, -5);

		// Imprimir las coordenadas de los puntos
		System.out.println("Punto p1: " + p1);
		System.out.println("Punto p2: " + p2);

		// Modificar las coordenadas del punto p1 a (3,6)
		p1.setX(3);
		p1.setY(6);

		// Imprimir las coordenadas del punto p1 desplazado
		System.out.println("Punto p1 desplazado: " + p1);

		// Desplazar el punto p1 (2,5)
		p1.desplaza(2, 5);

		// Imprimir las coordenadas del punto p1 desplazado
		System.out.println("Punto p1 desplazado: " + p1);

		// Calcular la distancia entre p1 y p2
		double distancia = p1.distancia(p2);

		// Imprimir el resultado
		System.out.println("Distancia entre p1 y p2: " + distancia);
	}

}
