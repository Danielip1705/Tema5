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
    /**
     * Get de atributo X
     * @return atributo X
     */
    public int getX() {
        return x;
    }
    
    /**
     * Set de atributo x
     * @param x Atributo X
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Get de atributo Y
     * @return Atributo Y
     */
    public int getY() {
        return y;
    }

    /**
     * Set de atributo Y
     * @param y Atributo Y
     */
    public void setY(int y) {
        this.y = y;
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
