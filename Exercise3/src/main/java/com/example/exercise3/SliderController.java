package com.example.exercise3;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;
public class SliderController implements Initializable {
    @FXML
    private Label celsiusLabel, fahrenheitLabel;
    @FXML
    private Slider sliderControl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void sliderListener() {
        celsiusLabel.setText(" " + sliderControl.getValue());
        double fahrenheit = (9.0 / 5.0) * sliderControl.getValue() + 32;
        fahrenheitLabel.setText(" " + fahrenheit);
    }
}