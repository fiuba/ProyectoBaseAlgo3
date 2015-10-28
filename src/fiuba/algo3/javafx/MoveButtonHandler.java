package fiuba.algo3.javafx;

import fiuba.algo3.ejemplomvc.modelo.Robot;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by nicopaez on 10/28/15.
 */
public class MoveButtonHandler implements EventHandler<ActionEvent> {


    private final BoxView view;
    private final Robot robot;

    public MoveButtonHandler(BoxView view, Robot robot) {
        this.view = view;
        this.robot = robot;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.robot.move();
        this.view.update();
    }
}

