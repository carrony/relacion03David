package ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		/* 
		 * Programa que escribe las tablas de multiplicar del 1 al 10
		 */
		
		System.out.println("TAblas de multiplicar");
		
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.printf("Tabla del %d\n",tabla);
			for (int j = 0; j <= 10; j++) {
				System.out.printf("%d x %d = %d\n", tabla,j,tabla*j);
			}
		}

	}

}
