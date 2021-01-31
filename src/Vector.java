public class Vector {
    private double modulo;
    private double anguloOXY;
    private double anguloOYZ;
    private double anguloOXZ;

    public double getModulo() {
        return this.modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    public double getAnguloOXY() {
        return this.anguloOXY;
    }

    public void setAnguloOXY(double anguloOXY) {
        this.anguloOXY = anguloOXY;
    }

    public double getAnguloOYZ() {
        return this.anguloOYZ;
    }

    public void setAnguloOYZ(double anguloOYZ) {
        this.anguloOYZ = anguloOYZ;
    }

    public double getAnguloOXZ() {
        return this.anguloOXZ;
    }

    public void setAnguloOXZ(double anguloOXZ) {
        this.anguloOXZ = anguloOXZ;
    }

    @Override
    public String toString() {
        return "{" + " modulo='" + getModulo() + "'" + ", anguloOXY='" + getAnguloOXY() + "'" + ", anguloOYZ='"
                + getAnguloOYZ() + "'" + ", anguloOXZ='" + getAnguloOXZ() + "'" + "}";
    }

    public Vector(double modulo, double anguloOXY, double anguloOYZ, double anguloOXZ) {
        this.modulo = modulo;
        this.anguloOXY = anguloOXY;
        this.anguloOYZ = anguloOYZ;
        this.anguloOXZ = anguloOXZ;
    }

}
