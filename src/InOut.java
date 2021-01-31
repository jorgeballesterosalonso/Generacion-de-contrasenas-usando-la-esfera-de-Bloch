import java.util.Scanner;

/**
 * @author Jorge Ballesteros
 */
public class InOut {
    static Scanner sc = new Scanner(System.in);

    public static Punto crearPunto() {

        Punto p = new Punto();

        System.out.println("Ingrese la coordenada x del vector: ");
        long x = sc.nextLong();
        p.setCoordX(x);

        System.out.println("Ingrese la coordenada y del vector: ");
        long y = sc.nextLong();
        p.setCoordY(y);

        System.out.println("Ingrese la coordenada z del vector: ");
        long z = sc.nextLong();
        p.setCoordZ(z);

        return p;

    }
}
