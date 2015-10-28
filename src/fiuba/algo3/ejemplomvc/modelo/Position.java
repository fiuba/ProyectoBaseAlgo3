package fiuba.algo3.ejemplomvc.modelo;

/**
 * Created by nicopaez on 10/26/15.
 */
public class Position {

    private int x;
    private int y;

    public Position(int posX, int posY) {
        this.x = posX;
        this.y = posY;
    }

    public Position next(Direction direction) {
        return direction.nextPosition(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Position other = (Position) obj;

        return (this.getX() == other.getX() && this.getY() == other.getY());
    }

}
