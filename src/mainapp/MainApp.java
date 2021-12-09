package mainapp;

import models.Persona;
import models.CuentaCorriente;
import java.util.*;

public class MainApp {

	static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	static Scanner s = new Scanner(System.in);

	static String nombre = "";
	static String apellidos = "";
	static String dni = "";
	static double sueldo = 0;
	static String opcion = "";
	static int contadorCuenta = 0;
	static int i = 1;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String nombre = "";
		String apellidos = "";
		String dni = "";
		double sueldo = 0;
		String opcion = "";
		int contadorCuenta = 0;
		int i = 1;

		System.out.println("--------------------------");
		System.out.println("| Bienvenido/a a Unicaja |");
		System.out.println("--------------------------");
		System.out.println("MENÚ:");

		do {

			System.out.println("\n1. Añadir persona\n2. Elegir persona\n3. Borrar persona\n4. Salir");

			System.out.println();
			System.out.print("¿Qué operación desea realizar? ");

			opcion = s.nextLine();
			System.out.println();

			switch (opcion) {
			case "1":

				System.out.print("Introduce el nombre: ");
				nombre = s.nextLine();

				System.out.print("Introduce los apellidos: ");
				apellidos = s.nextLine();

				System.out.print("Introduce el DNI: ");
				dni = s.nextLine();

				System.out.print("Introduce tu sueldo: ");
				sueldo = Double.parseDouble(s.nextLine());

				contadorCuenta++;
				CuentaCorriente cuenta = new CuentaCorriente(contadorCuenta, 0, null);
				listaPersonas.add(new Persona(nombre, apellidos, dni, sueldo, cuenta));

				break;

			case "2":

				i = 1;

				for (Persona p : listaPersonas) {
					System.out.println(i + ". " + p.getDni() + " " + p.getNombre());
					i++;
				}

				int indiceLista;

				do {
					System.out.print("\nElige una persona: ");
					indiceLista = Integer.parseInt(s.nextLine());
					System.out.println();
					if (indiceLista <= listaPersonas.size()) {
						System.out
								.println("Has elegido a " + listaPersonas.get(indiceLista - 1).nombrePersona() + "\n");
					} else {
						System.out.println("La persona no está en la lista");
					}
				} while (indiceLista > listaPersonas.size());

				do {
					System.out.println(
							"\t1. Cobrar sueldo\n\t2. Sacar pasta\n\t3. Subir sueldo\n\t4. Mostrar detalles de la persona\n\t5. Atrás");

					System.out.println();

					System.out.print("¿Qué quieres hacer con la persona seleccionada? ");
					opcion = s.nextLine();
					System.out.println();
					Persona elegida = listaPersonas.get(indiceLista - 1);
					switch (opcion) {
					case "1":
						elegida.cobrarSueldo();
						System.out.println("Has cobrado tu sueldo\n");
						System.out.println(elegida);
						System.out.println();

						break;

					case "2":
						System.out.print("¿Cuánto quieres sacar?: ");
						elegida.sacarPasta(Double.parseDouble(s.nextLine()));
						System.out.println(elegida);
						System.out.println();

						break;

					case "3":
						System.out.print("Subir sueldo: ");
						elegida.subirSueldo(Double.parseDouble(s.nextLine()));
						System.out.println("Tu nuevo sueldo es de " + elegida.getSueldo() + "€");
						System.out.println();

						break;

					case "4":
						System.out.println("Detalles de la persona:\n");
						System.out.println(elegida);
						System.out.println();

						break;

					case "5":
						
						menu();

						break;

					default:
						System.out.println("La opción introducida no es correcta.");
						break;
					}
				} while (opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2") || opcion.equalsIgnoreCase("3")
						|| opcion.equalsIgnoreCase("4"));
				break;

			case "3":
				for (Persona p : listaPersonas) {
					System.out.println(i + ". " + p.getDni() + " " + p.getNombre() + " " + p.getApellidos());
					i++;
				}

				System.out.println();
				System.out.print("¿Qué persona quieres borrar? ");

				indiceLista = Integer.parseInt(s.nextLine());
				System.out.println();
				if (indiceLista <= listaPersonas.size()) {
					System.out.println("Has borrado a " + listaPersonas.get(indiceLista - 1).nombrePersona());
					listaPersonas.remove(indiceLista - 1);
					i = 1;
				} else {
					System.out.println("La persona no está en la lista");
				}

				break;

			case "4":
				System.out.println("¡Hasta luego! Tenga un buen día :)");
				break;

			default:
				System.out.println("La opción introducida no es correcta.");
				break;
			}

		} while (opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2") || opcion.equalsIgnoreCase("3"));

		s.close();

	}

	public static void menu() {

		System.out.println("MENÚ:");

		do {

			System.out.println("\n1. Añadir persona\n2. Elegir persona\n3. Borrar persona\n4. Salir");

			System.out.println();
			System.out.print("¿Qué operación desea realizar? ");

			opcion = s.nextLine();
			System.out.println();

			switch (opcion) {
			case "1":

				System.out.print("Introduce el nombre: ");
				nombre = s.nextLine();

				System.out.print("Introduce los apellidos: ");
				apellidos = s.nextLine();

				System.out.print("Introduce el DNI: ");
				dni = s.nextLine();

				System.out.print("Introduce tu sueldo: ");
				sueldo = Double.parseDouble(s.nextLine());

				contadorCuenta++;
				CuentaCorriente cuenta = new CuentaCorriente(contadorCuenta, 0, null);
				listaPersonas.add(new Persona(nombre, apellidos, dni, sueldo, cuenta));

				break;

			case "2":

				i = 1;

				for (Persona p : listaPersonas) {
					System.out.println(i + ". " + p.getDni() + " " + p.getNombre());
					i++;
				}

				int indiceLista;

				do {
					System.out.print("\nElige una persona: ");
					indiceLista = Integer.parseInt(s.nextLine());
					System.out.println();
					if (indiceLista <= listaPersonas.size()) {
						System.out
								.println("Has elegido a " + listaPersonas.get(indiceLista - 1).nombrePersona() + "\n");
					} else {
						System.out.println("La persona no está en la lista");
					}
				} while (indiceLista > listaPersonas.size());

				do {
					System.out.println(
							"\t1. Cobrar sueldo\n\t2. Sacar pasta\n\3. Subir sueldo\n\t4. Mostrar detalles de la persona\n\t5. Atrás");

					System.out.println();

					System.out.print("¿Qué quieres hacer con la persona seleccionada? ");
					opcion = s.nextLine();
					System.out.println();
					Persona elegida = listaPersonas.get(indiceLista - 1);
					switch (opcion) {
					case "1":
						elegida.cobrarSueldo();
						System.out.println("Felicidades crack, has cobrado\n");
						System.out.println(elegida);
						System.out.println();

						break;

					case "2":
						System.out.print("¿Cuánto quieres sacar?: ");
						elegida.sacarPasta(Double.parseDouble(s.nextLine()));
						System.out.println(elegida);
						System.out.println();

						break;

					case "3":
						System.out.print("Subir sueldo: ");
						elegida.subirSueldo(Double.parseDouble(s.nextLine()));
						System.out.println("Tu nuevo sueldo es de " + elegida.getSueldo() + "€");
						System.out.println();

						break;

					case "4":
						System.out.println("Detalles de la persona:\n");
						System.out.println(elegida);
						System.out.println();

						break;

					case "5":

						menu();

						break;

					default:
						System.out.println("La opción introducida no es correcta.");
						break;
					}
				} while (opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2") || opcion.equalsIgnoreCase("3")
						|| opcion.equalsIgnoreCase("4"));
				break;

			case "3":
				for (Persona p : listaPersonas) {
					System.out.println(i + ". " + p.getDni() + " " + p.getNombre() + " " + p.getApellidos());
					i++;
				}

				System.out.println();
				System.out.print("¿Qué persona quieres borrar? ");

				indiceLista = Integer.parseInt(s.nextLine());
				System.out.println();
				if (indiceLista <= listaPersonas.size()) {
					System.out.println("Has borrado a " + listaPersonas.get(indiceLista - 1).nombrePersona());
					listaPersonas.remove(indiceLista - 1);
					i = 1;
				} else {
					System.out.println("La persona no está en la lista");
				}

				break;

			case "4":
				System.out.println("¡Hasta luego! Tenga un buen día :)");
				break;

			default:
				System.out.println("La opción introducida no es correcta.");
				break;
			}

		} while (opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2") || opcion.equalsIgnoreCase("3"));

		s.close();
	}

}
