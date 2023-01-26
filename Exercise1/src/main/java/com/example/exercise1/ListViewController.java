package com.example.exercise1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class ListViewController {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView<String> lvItem;
    @FXML
    private Label selectedItem;
    @FXML
    private Button listViewBtn;

    @FXML
    public void initialize() {
        lvItem.getItems().addAll("Poodle", "Great Dane", "Labrador", "Terrier");

        lvItem.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ObservableList<String> selections = lvItem.getSelectionModel().getSelectedItems();
        String[] itemArray = selections.toArray(new String[0]);
        ObservableList<String> strList = FXCollections.observableArrayList(itemArray);
        // Populate the ListView control:
        lvItem.getItems().addAll(strList);
    }
    @FXML
    void displaySelectedItem() {
        selectedItem.setText(" " + lvItem.getSelectionModel().getSelectedItems());
    }
}