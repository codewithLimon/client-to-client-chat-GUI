package com.example.demochat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client_Runner extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("chat_gui.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chat");
        primaryStage.show();
    }

}
