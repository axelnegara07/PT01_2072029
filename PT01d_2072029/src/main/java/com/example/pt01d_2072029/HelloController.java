package com.example.pt01d_2072029;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label angka;
    public int i = 2;

    @FXML
    protected void button(){
        angka.setText(String.valueOf(i++));
    }
    @FXML
    protected void reset(){
        angka.setText(String.valueOf("1"));
        i = 2;
    }
}