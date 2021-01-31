import java.lang.Math;
import java.util.Scanner;

/**
 * 
 * @author Jorge Ballesteros
 *
 */
public class Cosas {

	static double x;
	static double y;
	static double z;
	static double vector1;

	public static void main(String[] args) {

		recogidaDeDatos();

		System.out.print("Ángulo formado por el vector de O al punto ingresado y el plano OXZ:  ");
		System.out.println(calcularAngulo(1));

		System.out.print("Ángulo formado por el vector de O al punto ingresado y el plano OXY:  ");
		System.out.println(calcularAngulo(2));

		System.out.print("Ángulo formado por el vector de O al punto ingresado y el plano OYZ:  ");
		System.out.println(calcularAngulo(3));
	}

	/**
	 * Recoge los datos para las variables X, Y, Z
	 */
	public static void recogidaDeDatos() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la primera coordenada del 0 al 10");
		obtenerCoordenadaX(sc);

		System.out.println("Ingrese la segunda coordenada del 0 al 10");
		obtenerCoordenadaY(sc);

		System.out.println("Ingrese la tercera coordenada del 0 al 10");
		obtenerCoordenadaZ(sc);

		System.out.println("Ingrese el factor de multiplicaci�n cualquiera");
		double factor;

		try {
			factor = Double.parseDouble(sc.next());

		} catch (NumberFormatException e) {
			System.err.println("Ingrese un caracter v�lido");
			factor = Double.parseDouble(sc.next());

		}
		vector1 = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)) * factor;

		System.out.println(vector1);

		sc.close();
	}

	/**
	 * Pide al usuario la tercera coordenada del punto en cuestión
	 * 
	 * @param sc
	 */
	private static void obtenerCoordenadaZ(Scanner sc) {
		boolean repetir;
		do {
			try {
				z = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				z = 0;

			}
			try {
				while (z > 10 || z < 0) {
					System.err.println("Ingrese un n�mero dentro del rango (0-10)");
					z = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				z = 0;
			}
		} while (repetir);
	}

	/**
	 * Pide al usuario la segunda coordenada del punto en cuestión
	 * 
	 * @param sc
	 */
	private static void obtenerCoordenadaY(Scanner sc) {
		boolean repetir;
		do {
			try {
				y = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				y = 0;

			}
			try {
				while (y > 10 || y < 0) {
					System.err.println("Ingrese un n�mero dentro del rango (0-10)");
					y = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				y = 0;
			}
		} while (repetir);
	}

	/**
	 * Pide al usuario la primera coordenada del punto en cuestión
	 * 
	 * @param sc
	 */
	private static void obtenerCoordenadaX(Scanner sc) {

		boolean repetir;

		do {

			// El try con el parseDouble prueba si lo que se ha introducido es un número,
			// en caso contrario se pasa al catch debido a que se ha introducido un caracter
			// diferente

			try {
				x = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				x = 0;
			}
			try {
				while (x > 10 || x < 0) {
					System.err.println("Ingrese un n�mero dentro del rango (0-10)");
					x = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				x = 0;
			}
		} while (repetir);
	}

	/**
	 * Devuelve el �ngulo calculado del vector con los 3 planos principales
	 * 
	 * @param a el caso de con qu� plano se quiere calcular (1 OYZ, 2 OXY, 3OXZ)
	 * @return el �ngulo correspondiente
	 */
	public static double calcularAngulo(int a) {

		switch (a) {

		case 1:
			// Caso de prueba x=3, y=2, z=1
			// Resultados esperados: alpha=15.5� beta=32.31� gamma=53.3�
			// GeoGebra: https://www.geogebra.org/3d/zfrn35mh

			// Plano base según maqueta
			double anguloOXZ = 0;
			anguloOXZ = y / vector1;
			return anguloOXZ;

		case 2:
			// Plano derecho según maqueta
			double anguloOXY = 0;
			anguloOXY = Math.asin(z / vector1);
			return anguloOXY;

		case 3:
			// Plano izquierdo según maqueta
			double anguloOYZ = 0;
			anguloOYZ = Math.asin(x / vector1);
			return anguloOYZ;

		default:
			return 0;
		}

	}
}
