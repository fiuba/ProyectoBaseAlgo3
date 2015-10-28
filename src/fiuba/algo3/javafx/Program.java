package fiuba.algo3.javafx;


import fiuba.algo3.ejemplomvc.modelo.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*
import fiuba.algo3.javafx.eventos.manejadores.BotonEnviarEventHandler;
import fiuba.algo3.javafx.eventos.manejadores.BotonLimpiarEventHandler;
import fiuba.algo3.javafx.eventos.manejadores.TextoEventHandler;
*/

/**
 * Created by nicopaez on 10/26/15.
 */
public class Program extends Application {

    public static void main(String[] args) {
        launch(args);
    }



    GraphicsContext gc;
    BoxView boxView;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Robot robot = createModel();

        primaryStage.setTitle("Ejemplo MVC con JavaFx");

        Group canvasContainer = new Group();
        Canvas canvas = new Canvas(460, 220);
        gc = canvas.getGraphicsContext2D();
        this.boxView = new BoxView(gc, robot);
        this.boxView.draw();

        canvasContainer.getChildren().add(canvas);

        Button moveButton = new Button();
        moveButton.setText("Move");
        MoveButtonHandler moveButtonHandler = new MoveButtonHandler(this.boxView, robot);
        moveButton.setOnAction(moveButtonHandler);


        Button directionButton = new Button();
        directionButton.setText("Change direction");
        DirectionButtonHandler directionButtonHandler = new DirectionButtonHandler(robot);
        directionButton.setOnAction(directionButtonHandler);


        HBox contenedorHorizontal = new HBox(moveButton, directionButton);
        contenedorHorizontal.setSpacing(10);

        VBox contenedorPrincipal = new VBox(contenedorHorizontal, canvasContainer);
        contenedorPrincipal.setSpacing(10);
        contenedorPrincipal.setPadding(new Insets(20));


        primaryStage.setScene(new Scene(contenedorPrincipal,500,300));
        primaryStage.show();



        /*
        BotonLimpiarEventHandler botonLimpiarEventHandler = new BotonLimpiarEventHandler(texto);
        botonLimpiar.setOnAction(botonLimpiarEventHandler);

        BotonEnviarEventHandler botonEnviarEventHandler = new BotonEnviarEventHandler(texto, etiqueta);
        botonEnviar.setOnAction(botonEnviarEventHandler);

        TextoEventHandler textoEventHandler = new TextoEventHandler(botonEnviar);
        texto.setOnKeyPressed(textoEventHandler);

        */

        //Scene scene = new Scene(contenedorPrincipal, 300, 250);

        //stage.setScene(scene);

        //stage.show();
    }

    private Robot createModel() {
        Box box = new Box(460,250);
        Sensor sensor = new Sensor(box);
        Robot robot = new Robot(sensor, new Position(10,10));
        robot.setDirection(Direction.west());
        return robot;
    }
}