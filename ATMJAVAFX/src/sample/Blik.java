package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Blik {

    @FXML
    private Label code;

    @FXML
    private Button oneButton;

    @FXML
    private Button backButton;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if (event.getSource() == oneButton) {
            Random rand = new Random();
            int n = ThreadLocalRandom.current().nextInt(10000, 99999);
            n += 1;
            code.setText("" + n);
        } else if (event.getSource() == backButton) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuATM.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("back");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }

        }
    }
        }