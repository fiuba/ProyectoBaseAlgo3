package fiuba.algo3.ejemplomvc.modelo;

public class Direction {

    private static Direction north;
    private static Direction south;
    private static Direction east;
    private static Direction west;

    static {
        north = new Direction(0,1);
        south = new Direction(0,-1);
        east = new Direction(1,0);
        west = new Direction(-1,0);

        north.setInverse(south);
        south.setInverse(north);
        east.setInverse(west);
        west.setInverse(east);
    }

    private Direction inverse;
    private int valueX;
    private int valueY;

    private Direction(int valX, int valY) {
        this.valueX =  valX;
        this.valueY =  valY;
    }

    private void setInverse(Direction inverse) {
        this.inverse = inverse;
    }

    public static Direction north() {
        return north;
    }

    public Direction inverse() {
        return this.inverse;
    }

    public Position nextPosition(Position position) {
        int nextX = position.getX() + this.valueX * 10;
        int nextY = position.getY() + this.valueY * 10;

        return new Position(nextX, nextY);
    }

    public static Direction south() {
        return south;
    }

    public static Direction east() {
        return east;
    }

    public static Direction west() {
        return west;
    }
}
