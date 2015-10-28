package fiuba.algo3.ejemplomvc.modelo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 10/26/15.
 */
public class SensorTest {

    @Test
    public void isInContactShouldBeTrueWhenYisEquals() {
        Box box = new Box(5,5);
        Position pos = new Position(4,5);
        Sensor s = new Sensor(box);
        Assert.assertTrue(s.isInContact(pos));
    }

    @Test
    public void isInContactShouldBeTrueWhenYisGreater() {
        Box box = new Box(5,5);
        Position pos = new Position(4,6);
        Sensor s = new Sensor(box);
        Assert.assertTrue(s.isInContact(pos));
    }

    @Test
    public void isInContactShouldBeTrueWhenXisGreater() {
        Box box = new Box(5,5);
        Position pos = new Position(6,4);
        Sensor s = new Sensor(box);
        Assert.assertTrue(s.isInContact(pos));
    }

}
