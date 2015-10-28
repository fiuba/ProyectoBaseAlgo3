package fiuba.algo3.ejemplomvc.modelo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicopaez on 10/28/15.
 */
public class RobotTest {

    @Test
    public void rotateShouldSetNorthWhenWest(){
        Sensor sensor = null;
        Robot robot = new Robot(sensor, new Position(10,10));
        robot.setDirection(Direction.west());
        robot.rotate();
        Assert.assertEquals(Direction.north(), robot.getDirection());

    }
}
