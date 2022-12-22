package ejercicios;

public class Ejercicio12 {

	public static void main(String[] args) {
		/* 
		 * Programa que escribe las tablas de multiplicar del 1 al 10
		 */
		
		System.out.println("TAblas de multiplicar");
		int tabla= 1;
		while (tabla <= 10 ) {
			System.out.printf("Tabla del %d\n",tabla);
			int j=0;
			while ( j <= 10) {
				System.out.printf("%d x %d = %d\n", tabla,j,tabla*j);
				j++;
			}
			tabla++;
		}

	}

}
