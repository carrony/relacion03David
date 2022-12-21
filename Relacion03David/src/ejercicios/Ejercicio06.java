package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * 6. Algoritmo que calcule el factorial 
		 * de un número entero introducido por el usuario.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número para calcular su factorial");
		int num = teclado.nextInt();
		
		long acum = 1;
		for (int i = num; i > 1 ; i--) {
			
			acum = acum * i;
			if (acum<0) {
				System.err.println("No se puede calcular");
				System.exit(0);
			}
		}
		System.out.println("El factorial es "+ acum);

	}

}
