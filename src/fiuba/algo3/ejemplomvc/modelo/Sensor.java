package fiuba.algo3.ejemplomvc.modelo;

public class Sensor {

    private final Box box;

    public Sensor(Box box) {
        this.box = box;
    }

    public boolean isInContact(Position position) {
        boolean contactX = Math.abs(position.getX()) >= box.getWidth()/2;
        boolean contactY = Math.abs(position.getY()) >= box.getHeight()/2;
        return contactX || contactY;
    }
}
