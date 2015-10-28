package fiuba.algo3.ejemplomvc.modelo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 10/26/15.
 */
public class DirectionTest {

    @Test
    public void inverseNorthShouldBeShouth() {
        Assert.assertEquals(Direction.south(), Direction.north().inverse());
    }

    @Test
    public void inverseEastShouldBeWest() {
        Assert.assertEquals(Direction.east(), Direction.west().inverse());
    }

    @Test
    public void nextPositionOnNorthShouldIncreaseY() {
        Direction north = Direction.north();
        Position currentPosition = new Position(1,1);
        Position expectedNextPosition = new Position(1,11);

        Position nextPosition = north.nextPosition(currentPosition);

        Assert.assertEquals(expectedNextPosition, nextPosition);
    }

    @Test
    public void nextPositionOnSouthShouldDecreaseY() {
        Direction north = Direction.south();
        Position currentPosition = new Position(1,1);
        Position expectedNextPosition = new Position(1,-9);

        Position nextPosition = north.nextPosition(currentPosition);

        Assert.assertEquals(expectedNextPosition, nextPosition);
    }

}
