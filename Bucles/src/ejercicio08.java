import java.util.*;

public class ejercicio08 {

	public static void main(String[] args) {
		// Muestra la tabla de multiplicar de un número introducido por teclado.

		Scanner s = new Scanner(System.in);
		int numero = 0;

		System.out.print("Introduce un número para ver su tabla de multiplicar: ");
		numero = Integer.parseInt(s.nextLine());

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));

		}
		s.close();
	}

}
