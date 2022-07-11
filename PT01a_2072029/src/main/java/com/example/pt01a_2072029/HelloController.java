package com.example.pt01a_2072029;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField bilangan1;
    @FXML
    private TextField bilangan2;
    @FXML
    private TextField hasil;


    @FXML
    protected void tambah() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int totalVal = bil1 + bil2;
        hasil.setText(String.valueOf(totalVal));
    }

    @FXML
    protected void kurang() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int totalVal = bil1 - bil2;
        hasil.setText(String.valueOf(totalVal));
    }

    @FXML
    protected void kali() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int totalVal = bil1 * bil2;
        hasil.setText(String.valueOf(totalVal));
    }

    @FXML
    protected void bagi() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int totalVal = bil1 / bil2;
        hasil.setText(String.valueOf(totalVal));
    }
}