/**
 * @author Jorge Ballesteros
 */
public class Punto {
    private long coordX;
    private long coordY;
    private long coordZ;

    public long getCoordX() {
        return this.coordX;
    }

    public void setCoordX(long coordX) {
        this.coordX = coordX;
    }

    public long getCoordY() {
        return this.coordY;
    }

    public void setCoordY(long coordY) {
        this.coordY = coordY;
    }

    public long getCoordZ() {
        return this.coordZ;
    }

    public void setCoordZ(long coordZ) {
        this.coordZ = coordZ;
    }

    @Override
    public String toString() {
        return "{" + " coordX='" + getCoordX() + "'" + ", coordY='" + getCoordY() + "'" + ", coordZ='" + getCoordZ()
                + "'" + "}";
    }

    public Punto(long coordX, long coordY, long coordZ) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }

    public Punto() {
    }

}
