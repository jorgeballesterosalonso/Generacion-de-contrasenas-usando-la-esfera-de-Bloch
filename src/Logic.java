import java.lang.Math;

/**
 * @author Jorge Ballesteros
 */
public class Logic {

    public static double calcularAnguloX0Y(Punto punto, Vector vector) {
        long x = punto.getCoordX();
        long y = punto.getCoordY();
        long z = punto.getCoordZ();

        double angulo = Math.asin(z / vector.getModulo());

        return angulo;
    }

    public static double calcularModulo(Punto punto) {
        double X = punto.getCoordX();
        double Y = punto.getCoordY();
        double Z = punto.getCoordZ();

        double Modulo = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));

        return Modulo;
    }

}
