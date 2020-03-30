package bsu.comp152;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var tag = new Label("Hello World");
        var firstScene = new Scene(tag);
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }
}
