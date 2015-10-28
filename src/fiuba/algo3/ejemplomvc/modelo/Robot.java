package fiuba.algo3.ejemplomvc.modelo;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by nicopaez on 10/26/15.
 */
public class Robot {
    private Direction direction;
    private Position position;
    public final int RATIO = 10;

    private Sensor sensor;
    private ConcurrentHashMap<Direction, Direction> rotationMap;

    public Robot(Sensor sensor, Position position) {
        this.sensor = sensor;
        this.position = position;
        this.rotationMap = new ConcurrentHashMap<>();
        this.rotationMap.put(Direction.west(), Direction.north());
        this.rotationMap.put(Direction.north(), Direction.east());
        this.rotationMap.put(Direction.east(), Direction.south());
        this.rotationMap.put(Direction.south(), Direction.west());
    }

    public void setDirection(Direction direccion) {
        this.direction = direccion;
    }

    public void move() {
        if (this.sensor.isInContact(this.position)) {
            this.direction = this.direction.inverse();
            this.position = this.position.next(this.direction);
        }
        else {
            this.position = this.position.next(this.direction);
        }

    }

    public Direction getDirection() {
        return this.direction;
    }

    public Position getPosition() {
        return position;
    }

    public void rotate() {
        this.setDirection(this.rotationMap.get(this.getDirection()));
    }
}
