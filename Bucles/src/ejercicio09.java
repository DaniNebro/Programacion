import java.util.*;

public class ejercicio09 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		// por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
		// con
		// la salvedad de que el anterior estaba limitado a números de 5 dígitos como
		// máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
		// esta manera, la única limitación en el número de dígitos la establece el tipo
		// de
		// dato que se utilice (int o long).

		Scanner s = new Scanner(System.in);
		int n = 0;
		int nDigitos = 1;

		System.out.print("Introduce un número: ");
		n = Integer.parseInt(s.nextLine());

		while (n > 10) {
			n /= 10;
			nDigitos++;
		}
		
		System.out.println("El número tiene " + nDigitos + " dígitos");
		s.close();

	}

}
