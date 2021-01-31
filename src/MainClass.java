/**
 * @author Jorge Ballesteros
 */
public class MainClass {
    public static void main(String[] args) {
        Punto punto = InOut.crearPunto();

        Vector vector = new Vector();

        vector.setPunto(punto);
        vector.setModulo(Logic.calcularModulo(punto));
        vector.setAnguloOXY(Logic.calcularAnguloX0Y(punto, vector));
        System.out.println(vector);
        

    }
}
