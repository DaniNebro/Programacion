import java.util.*;

public class ejercicio10 {

	public static void main(String[] args) {
		// Escribe un programa que calcule la media de un conjunto de n�meros positivos
		// introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
		// introducir�n. El usuario indicar� que ha terminado de introducir los datos
		// cuando meta un n�mero negativo.

		Scanner s = new Scanner(System.in);
		int n = 0;
		int nIntroducidos = -1; 
		double media = 0;

		do {
			System.out.print("Introduce n�meros positivos. N�mero negativo para terminar: ");
			n = Integer.parseInt(s.nextLine());
			nIntroducidos++;
		} while (n > -1);
		
		System.out.println("Has introducido " + nIntroducidos + " n�meros");
		

	}

}
