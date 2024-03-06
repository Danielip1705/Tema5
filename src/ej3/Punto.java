package ej3;

public class Punto {
	/**
	 * Numero entero que contiene la posicon X
	 */
    private int x;
    
    /**
     * Numero entero que contiene la posicion Y
     */
    private int y;

    /**
     * Constructor con parametros
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
    /**
     * Funcion que modifica las coordenadas
     * @param x Numero entero para modificar la coordenada X
     * @param y Numero entero para modificar la coordenada Y
     */
    public void setXY(int x, int y) {
    	this.x = x;
    	 this.y = y;
    }
    /**
     * Funcion que imprime Coordenadas
     * @param p Objeto de la clase punto
     */
 public void imprimePuntos(Punto p) {
    	
    	System.out.println("Coordenadas: ("+p.getX()+","+p.getY()+")");
    }

    /**
     * Funcion qeu desplaza los atributos segun el parametro de entrada
     * @param dx Numero hasta donde se desplaza del atributo X
     * @param dy Numero hasta donde se desplaza del atributo Y
     */
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

   
    /**
     * Funcion que calcula la distancia de ambos puntos
     * @param p Objeto de clase P
     * @return Double del calculo de ambos objetos
     */
    public double distancia(Punto p) {
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    
}
