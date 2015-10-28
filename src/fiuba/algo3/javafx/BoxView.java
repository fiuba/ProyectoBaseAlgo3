package fiuba.algo3.javafx;

import fiuba.algo3.ejemplomvc.modelo.Robot;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 * Created by nicopaez on 10/28/15.
 */
public class BoxView {

    private final Robot robot;
    GraphicsContext gc;

    public BoxView(GraphicsContext gc, Robot robot){
        this.gc = gc;
        this.robot = robot;
    }

    public void draw() {
        this.drawShapes(gc);
    }

    private void drawShapes(GraphicsContext gc) {
        this.clean();
        gc.setFill(Color.GREEN);
        gc.fillOval(robot.getPosition().getX() + 230, robot.getPosition().getY() + 110, robot.RATIO, robot.RATIO);
        /*

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                new double[]{210, 210, 240, 240}, 4);
                */
    }

    public void clean() {
        this.gc.setFill(Color.WHITE);
        this.gc.fillRect(0, 0, 460, 220);
    }

    public void update() {
        this.draw();
    }
}
