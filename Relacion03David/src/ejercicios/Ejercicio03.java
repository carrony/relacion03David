package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que imprima la tabla de multiplicar de un número pasado
		 * como parámetro con bucle do while
		 */
		int tabla=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("¿que tabla de multiplicar quieres (1-10)?");
			tabla = teclado.nextInt();
		}while(tabla<1 || tabla >10);
		
		
		int i = 0;
		do {
			System.out.printf("%d x %d = %d\n",tabla, i, tabla*i );
			i++;
		}while (i<=10);

	}

}
