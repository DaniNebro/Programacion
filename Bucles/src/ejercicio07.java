import java.util.*;

public class ejercicio07 {

	public static void main(String[] args) {
		// Realiza el control de acceso a una caja fuerte. La combinación será un
		// número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
		// acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
		// y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
		// Tendremos cuatro oportunidades para abrir la caja fuerte.

		Scanner s = new Scanner(System.in);
		int combinacion = 1234;
		int combIntroducida = 0;
		int intentos = 4;

		System.out.print("Introduce la combinación para abrir la caja fuerte: ");
		combIntroducida = Integer.parseInt(s.nextLine());

		if (combIntroducida == combinacion) {
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		} else {

			do {
				intentos--;
				System.out.println("Has fallado. Te quedan " + intentos + " intentos");
				System.out.print("Introduce la combinación para abrir la caja fuerte: ");
				combIntroducida = Integer.parseInt(s.nextLine());
				if (combIntroducida == combinacion) {
					System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				}
			} while (intentos > 1 && combIntroducida != combinacion);
		}

		s.close();
	}

}
