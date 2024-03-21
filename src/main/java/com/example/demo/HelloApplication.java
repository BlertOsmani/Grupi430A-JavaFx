package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Button button1;
//        button1 = new Button();
//        button1.setText("Click me");
        Button button1 = new Button("Click me");

//        button1.setOnAction(new EventHandler<ActionEvent>(){
//                @Override
//                public void handle(ActionEvent event){
//                    button1.setText("Hello");
//                }
//            }
//        );
        button1.setOnAction(e-> button1.setText("Thank you"));
        StackPane pane = new StackPane();
        pane.getChildren().add(button1);
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Digital school");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}