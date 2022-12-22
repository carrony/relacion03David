package ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		/* 
		 * Programa que escribe las tablas de multiplicar del 1 al 10
		 */
		
		System.out.println("TAblas de multiplicar");
		int tabla= 1;
		do {
			System.out.printf("Tabla del %d\n",tabla);
			int j=0;
			do {
				System.out.printf("%d x %d = %d\n", tabla,j,tabla*j);
				j++;
			} while ( j <= 10);
			tabla++;
		}while (tabla <= 10 );

	}

}
