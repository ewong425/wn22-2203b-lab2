package com.example.exercise1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ListViewController {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView<String> lvItem;
    @FXML
    private Button listViewBtn;
    @FXML
    private Label selectedItem;
    @FXML
    public void initialize() {
        lvItem.getItems().addAll("Poodle", "Great Dane", "Labrador", "Terrier");
    }
    @FXML
    void displaySelectedItem() {
        selectedItem.setText(lvItem.getSelectionModel().getSelectedItem());
    }
}