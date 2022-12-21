package ejercicios;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio06bis {

	public static void main(String[] args) {
		/*
		 * 6. Algoritmo que calcule el factorial 
		 * de un número entero introducido por el usuario.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número para calcular su factorial");
		int num = teclado.nextInt();
		
		BigInteger acum = BigInteger.ONE;
		for (int i = num; i > 1 ; i--) {
			
			acum=acum.multiply(BigInteger.valueOf(i));
		}
		System.out.println("El factorial es "+ acum);
		teclado.close();
	}

}
