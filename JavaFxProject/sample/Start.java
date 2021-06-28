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

public class Start {

    @FXML
    private Label introcard;

    @FXML
    private Label polishLabel;

    @FXML
    private Label englishLabel;

    @FXML
    private Button polishButton;

    @FXML
    private Button englishButton;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (event.getSource() == polishButton) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("samplepl.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("back");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }

        } else if (event.getSource() == englishButton) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("back");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }


        }
    }
}