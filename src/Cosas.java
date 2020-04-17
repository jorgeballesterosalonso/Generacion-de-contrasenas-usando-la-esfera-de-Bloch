import java.lang.Math;
import java.util.Scanner;

public class Cosas {

	public static void main(String[] args) {
		recogidadedatos();

		calcularAngulo();
	}

	private static void recogidadedatos() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la primera coordenada del 0 al 10");
		double x;

		try {
			x = Double.parseDouble(sc.next());

		} catch (NumberFormatException e) {
			System.err.println("Ingrese un caracter válido");
			x = Double.parseDouble(sc.next());
		}

		while (x > 10 || x < 0) {
			System.err.println("Ingrese un número dentro del rango (0-10)");
			x = sc.nextDouble();
		}

		System.out.println("Ingrese la primera coordenada del 0 al 10");
		double y;

		try {
			y = Double.parseDouble(sc.next());

		} catch (NumberFormatException e) {
			System.err.println("Ingrese un caracter válido");
			y = Double.parseDouble(sc.next());
		}

		while (y > 10 || y < 0) {
			System.err.println("Ingrese un número dentro del rango (0-10)");
			y = sc.nextDouble();
		}

		System.out.println("Ingrese la primera coordenada del 0 al 10");
		double z;

		try {
			z = Double.parseDouble(sc.next());

		} catch (NumberFormatException e) {
			System.err.println("Ingrese un caracter válido");
			z = Double.parseDouble(sc.next());
		}

		while (z > 10 || z < 0) {
			System.err.println("Ingrese un número dentro del rango (0-10)");
			z = sc.nextDouble();
		}

		System.out.println("Ingrese el factor de multiplicación cualquiera");
		double factor;

		try {
			factor = Double.parseDouble(sc.next());

		} catch (NumberFormatException e) {
			System.err.println("Ingrese un caracter válido");
			factor = Double.parseDouble(sc.next());

		}
		double vector1 = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

		System.out.println(vector1);

		sc.close();
	}

	private static int calcularAngulo() {
		int angulo = 0;
		return angulo;
	}
}
