package ej1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dni;
		String dni1;
		String nombre;
		double saldo;
		double saldo1;
		
		System.out.println("Inserte su dni Persona1");
		
		CuentaCorriente cue = new CuentaCorriente(dni, saldo);
		
		CuentaCorriente cue1 = new CuentaCorriente(dni1,nombre,saldo1);
		
		sc.close();
	}

}
