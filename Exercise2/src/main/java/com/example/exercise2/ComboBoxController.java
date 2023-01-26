package com.example.exercise2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ComboBoxController implements Initializable {
    @FXML
    private ComboBox<String> cmbBoxSelector;
    @FXML
    private Label selectedItem;
    @FXML
    void displaySelectedItem() {
        selectedItem.setText(cmbBoxSelector.getSelectionModel().getSelectedItem() + "!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbBoxSelector.getItems().addAll("Will", "Megan", "Amanda", "Tyler");
    }
}