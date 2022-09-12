package com.example.gazdic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ArrayList<Person> usrs = new ArrayList<>();
        usrs.add(new Person("Pepa", 12));
        usrs.add(new Person("COBOL", 98));

        TableView tableView = new TableView();

        TableColumn<Person, String> nColumn = new TableColumn<>("první jméno");
        nColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Person, String> aColumn = new TableColumn<>("věk");
        aColumn.setMaxWidth(30);
        aColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        tableView.getColumns().add(nColumn);
        tableView.getColumns().add(aColumn);

        tableView.getItems().add(usrs.get(0));
        tableView.getItems().add(usrs.get(1));

        tableView.setMaxWidth(200);
        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox);


        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
