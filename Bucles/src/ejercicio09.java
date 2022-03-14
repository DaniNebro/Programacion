import java.util.*;

public class ejercicio09 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido
		// por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
		// con
		// la salvedad de que el anterior estaba limitado a n�meros de 5 d�gitos como
		// m�ximo. En esta ocasi�n, hay que realizar el ejercicio utilizando bucles; de
		// esta manera, la �nica limitaci�n en el n�mero de d�gitos la establece el tipo
		// de
		// dato que se utilice (int o long).

		Scanner s = new Scanner(System.in);
		int n = 0;
		int nDigitos = 1;

		System.out.print("Introduce un n�mero: ");
		n = Integer.parseInt(s.nextLine());

		while (n > 10) {
			n /= 10;
			nDigitos++;
		}
		
		System.out.println("El n�mero tiene " + nDigitos + " d�gitos");
		s.close();

	}

}
