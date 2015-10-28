package fiuba.algo3.ejemplomvc.modelo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 10/26/15.
 */
public class PositionTest {

    @Test
    public void equalsShouldReturnTrueWhenSameXY() {

        Position pos1 = new Position(1,1);
        Position pos2 = new Position(1,1);
        Assert.assertTrue(pos1.equals(pos2));
    }

    @Test
    public void equalsShouldReturnTrueWhenSameInstance() {

        Position pos1 = new Position(1,1);
        Assert.assertTrue(pos1.equals(pos1));
    }

    @Test
    public void equalsShouldReturnFalseWhenXYNotEquals() {

        Position pos1 = new Position(1,1);
        Position pos2 = new Position(1,2);
        Assert.assertFalse(pos1.equals(pos2));
    }

}
