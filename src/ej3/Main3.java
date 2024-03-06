package ej3;

public class Main3 {

	public static void main(String[] args) {
		// Creamos dos objetos con la clase Punto con coordenadas (4,2) y (3,9)
		Punto p1 = new Punto(4, 2);
		Punto p2 = new Punto(3, 9);
		
		double distancia;

		// Imprimir las coordenadas de los puntos
		p1.imprimePuntos(p1);
		p2.imprimePuntos(p2);

		// Modificar las coordenadas del punto p1 a (9,0)
		p1.setXY(9, 0);

		System.out.println("Coordenadas modificadas");
		
		// Imprimir las coordenadas del punto p1 modificado
		p1.imprimePuntos(p1);

		// Desplazar el punto p1 (2,5)
		p1.desplaza(2, 5);

		System.out.println("Coordenadas desplazadas");
		
		// Imprimir las coordenadas del punto p1 desplazado
		p1.imprimePuntos(p1);

		// Calcular la distancia entre p1 y p2
		distancia = p1.distancia(p2);

		// Imprimir el resultado
		System.out.println("Distancia entre p1 y p2: " + distancia);
	}

}
