package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Blik {

    @FXML
    private Label code;

    public void generateblik() {
        int x = (int) (Math.random() * 9);
        x = x + 1;
        String blik = (x + "") + (((int) (Math.random() * 1000)) + "");
        code.setText("" + blik);


    }
}

