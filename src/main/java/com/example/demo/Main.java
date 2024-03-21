package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Digital shcool");

        button = new Button("Click me");
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Close the window", "Are you sure you want to close the window");
            System.out.println(result);
        });

        Scene scene = new Scene(layout,300,300);

        window.setScene(scene);
        window.show();
    }
}
