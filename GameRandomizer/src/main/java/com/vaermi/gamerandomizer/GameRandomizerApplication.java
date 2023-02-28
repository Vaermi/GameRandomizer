package com.vaermi.gamerandomizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class GameRandomizerApplication extends Application {
    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(new Group());
        stage.setTitle("Game Randomizer by Vaermi");
        stage.setWidth(1366);
        stage.setHeight(768);
        TableView table = new TableView();
        final Label label = new Label("My Gaming List".toUpperCase());
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn gameNameCol = new TableColumn("Name of Game");
        gameNameCol.setMinWidth(400);

        TableColumn firstGenreCol = new TableColumn("Main-Genre");
        firstGenreCol.setMinWidth(200);

        TableColumn secondGenreCol = new TableColumn("Second-Genre");
        secondGenreCol.setMinWidth(200);

        TableColumn durationCol = new TableColumn("Duration");
        durationCol.setMinWidth(200);

        TableColumn achievementsCol = new TableColumn("Achievements");
        achievementsCol.setMinWidth(200);

        TableColumn checkCol = new TableColumn("Check");
        checkCol.setMinWidth(100);


        table.getColumns().addAll(gameNameCol, firstGenreCol, secondGenreCol, durationCol, achievementsCol, checkCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}