package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPl implements Initializable {


    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Button enterButton;

    @FXML
    private Button cardSlot;

    @FXML
    private PasswordField pin;

    @FXML
    private Label introcard;

    @FXML
    private Label upLabel;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if (event.getSource() == oneButton) {
            pin.setText(pin.getText() + "1");

        } else if (event.getSource() == twoButton) {
            pin.setText(pin.getText() + "2");

        } else if (event.getSource() == threeButton) {
            pin.setText(pin.getText() + "3");

        } else if (event.getSource() == fourButton) {
            pin.setText(pin.getText() + "4");

        } else if (event.getSource() == fiveButton) {
            pin.setText(pin.getText() + "5");

        } else if (event.getSource() == sixButton) {
            pin.setText(pin.getText() + "6");

        } else if (event.getSource() == sevenButton) {
            pin.setText(pin.getText() + "7");

        } else if (event.getSource() == eightButton) {
            pin.setText(pin.getText() + "8");

        } else if (event.getSource() == nineButton) {
            pin.setText(pin.getText() + "9");

        } else if (event.getSource() == zeroButton) {
            pin.setText(pin.getText() + "0");

        } else if (event.getSource() == cardSlot) {
            pin.setVisible(true);
            introcard.setVisible(false);
            upLabel.setText("Proszę podaj PIN:");

        } else if (event.getSource() == cancelButton) {
            Stage stage = (Stage) cancelButton.getScene().getWindow();
            stage.close();


        } else if (event.getSource() == clearButton) {
            pin.clear();

        } else if (event.getSource() == enterButton) {
            int pin1 = Integer.parseInt(pin.getText());
            if (pin1 == 1234) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuATMpl.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("Menu");
                    stage.show();
                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
            } else {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample2pl.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("Menu");
                    stage.show();
                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
            }
        }
    }





    @Override
    public void initialize (URL url, ResourceBundle resourceBundle){
    }
}



