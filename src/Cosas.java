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

		boolean repetir = false;
		do {
			try {
				x = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter válido");
				repetir = true;
				x = 0;
			}
			try {
				while (x > 10 || x < 0) {
					System.err.println("Ingrese un número dentro del rango (0-10)");
					x = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter válido");
				repetir = true;
				x = 0;
			}
		} while (repetir);

		System.out.println("Ingrese la segunda coordenada del 0 al 10");
		double y;

		do {
			try {
				y = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter válido");
				repetir = true;
				y = 0;

			}
			try {
				while (y > 10 || y < 0) {
					System.err.println("Ingrese un número dentro del rango (0-10)");
					y = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter válido");
				repetir = true;
				y = 0;
			}
		} while (repetir);

		System.out.println("Ingrese la tercera coordenada del 0 al 10");
		double z;

		do {
			try {
				z = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter válido");
				repetir = true;
				z = 0;

			}
			try {
				while (z > 10 || z < 0) {
					System.err.println("Ingrese un número dentro del rango (0-10)");
					z = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter válido");
				repetir = true;
				z = 0;
			}
		} while (repetir);

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
