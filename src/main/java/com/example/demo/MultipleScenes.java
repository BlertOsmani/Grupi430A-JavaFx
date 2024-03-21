package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleScenes extends Application {

    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button();
        button1.setText("Go to scene 2");
        button1.setOnAction(e -> primaryStage.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1,200, 250);

        Button button2 = new Button("Go back to scene 1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));

        Button button3 = new Button("Go to scene 3");
        button3.setOnAction(e -> Alert.display("Alert", "Can't go to the screen 3"));

        VBox layout3 = new VBox();
        layout3.getChildren().addAll(button2, button3);
        scene2 = new Scene(layout3, 400, 300);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
