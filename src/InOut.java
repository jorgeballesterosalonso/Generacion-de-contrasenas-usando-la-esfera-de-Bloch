import java.util.Scanner;

public class InOut {
    static Scanner sc = new Scanner(System.in);

    public static Vector crearVector() {

        Vector v = new Vector();

        System.out.println("Ingrese la coordenada x del vector: ");
        long x = sc.nextLong();
        v.setCoordX(x);

        System.out.println("Ingrese la coordenada y del vector: ");
        long y = sc.nextLong();
        v.setCoordY(y);

        System.out.println("Ingrese la coordenada z del vector: ");
        long z = sc.nextLong();
        v.setCoordZ(z);

        return v;

    }
}
