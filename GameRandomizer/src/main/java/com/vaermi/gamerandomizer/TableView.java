package com.vaermi.gamerandomizer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.TableElement;

/**
 * Provides all logic to create a tableview and configuration such as
 * resize window and set title for main window application.
 */
public class TableView extends GameRandomizerApplication {

    //private TableView table = new TableView();

    private final ObservableList<TableElement> elements = FXCollections.observableArrayList(
            new TableElement("Dark Souls", "Souls-like", "Dark Fantasy", "60+", "41", "yes"),
            new TableElement("Elden Ring", "Souls-like", "Dark Fantasy", "60+", "42", "no"),
            new TableElement("Sons of the Forest", "Survival", "Horror", "50+", "28", "no"),
            new TableElement("Hogwarts Legacy", "RPG", "Fantasy", "30+", "45", "no")
    );

    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(new Group());
        stage.setTitle("Game Randomizer by Vaermi");
        stage.setWidth(1366);
        stage.setHeight(768);
        javafx.scene.control.TableView table = new javafx.scene.control.TableView();
        final Label label = new Label("My Gaming List".toUpperCase());
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn titleCol = new TableColumn("Title");
        titleCol.setMinWidth(400);
        titleCol.setCellValueFactory(new PropertyValueFactory<TableElement, String>("title"));

        TableColumn firstGenreCol = new TableColumn("Main-Genre");
        firstGenreCol.setMinWidth(200);
        firstGenreCol.setCellValueFactory(new PropertyValueFactory<TableElement, String>("mainGenre"));

        TableColumn secondGenreCol = new TableColumn("Second-Genre");
        secondGenreCol.setMinWidth(200);
        secondGenreCol.setCellValueFactory(new PropertyValueFactory<TableElement, String>("secondGenre"));

        TableColumn durationCol = new TableColumn("Duration");
        durationCol.setMinWidth(200);
        durationCol.setCellValueFactory(new PropertyValueFactory<TableElement, String>("duration"));

        TableColumn achievementsCol = new TableColumn("Achievements");
        achievementsCol.setMinWidth(200);
        achievementsCol.setCellValueFactory(new PropertyValueFactory<TableElement, String>("achievements"));

        TableColumn checkCol = new TableColumn("Check");
        checkCol.setMinWidth(100);
        checkCol.setCellValueFactory(new PropertyValueFactory<TableElement, String>("check"));

        table.setItems(elements);
        table.getColumns().addAll(titleCol, firstGenreCol, secondGenreCol, durationCol, achievementsCol, checkCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        stage.setScene(scene);
        stage.show();
    }

}
