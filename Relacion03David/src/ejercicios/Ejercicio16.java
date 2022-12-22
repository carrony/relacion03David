package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que pida dos números naturales e imprimir su cociente 
		 * entero por el método de las restas sucesivas.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que calcula el cociente de una división "
				+ "entera por el algoritmo de las restas sucesivas");
		System.out.println("Dividendo: ");
		int dividendo = teclado.nextInt();
		System.out.println("Divisor: ");
		int divisor = teclado.nextInt();
		
		int cociente=0;
		int resto = dividendo;
		
		while(resto>=divisor) {
			resto= resto-divisor;
			cociente++;
		}
		System.out.printf("%d / %d = %d y el resto %d", dividendo, divisor, 
				cociente, resto);
		
	}

}
