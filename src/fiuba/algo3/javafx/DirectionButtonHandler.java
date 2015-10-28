package fiuba.algo3.javafx;

import fiuba.algo3.ejemplomvc.modelo.Robot;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by nicopaez on 10/28/15.
 */
public class DirectionButtonHandler implements EventHandler<ActionEvent> {

    private final Robot robot;

    public DirectionButtonHandler(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.robot.rotate();
    }
}



