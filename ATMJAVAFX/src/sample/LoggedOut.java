package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoggedOut {
    @FXML
    private Button cardSlotLogged;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == cardSlotLogged) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("Debit");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }


        }
    }
}

