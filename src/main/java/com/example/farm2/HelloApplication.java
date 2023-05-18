package com.example.farm2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1400, 600);
        stage.setScene(scene);stage.setTitle("Farm Management System");
        stage.setIconified(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}