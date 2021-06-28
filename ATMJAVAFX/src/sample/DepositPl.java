package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DepositPl implements Initializable {
    Account account = new Account();
    int a = account.balance;

    @FXML
    private Button oneButtonMenu;

    @FXML
    private Button twoButtonMenu;

    @FXML
    private Button threeButtonMenu;

    @FXML
    private Button fourButtonMenu;

    @FXML
    private Button fiveButtonMenu;

    @FXML
    private Button sixButtonMenu;

    @FXML
    private Button sevenButtonMenu;

    @FXML
    private Button eightButtonMenu;

    @FXML
    private Button nineButtonMenu;

    @FXML
    private Button zeroButtonMenu;

    @FXML
    private Button clearButtonMenu;

    @FXML
    private Button cancelButtonMenu;

    @FXML
    private Button enterButtonMenu;

    @FXML
    private Button backButtonMenu;

    @FXML
    private TextArea resultArea;

    @FXML
    private Label upLabel;

    @FXML
    private Label accountLabel;


    @FXML
    private void handleButtonAction(ActionEvent event) {

        double actualBalance = 0;
        float ammount = 0;
        if (event.getSource() == oneButtonMenu) {
            resultArea.setText(resultArea.getText() + "1");

        } else if (event.getSource() == twoButtonMenu) {
            resultArea.setText(resultArea.getText() + "2");

        } else if (event.getSource() == threeButtonMenu) {
            resultArea.setText(resultArea.getText() + "3");

        } else if (event.getSource() == fourButtonMenu) {
            resultArea.setText(resultArea.getText() + "4");

        } else if (event.getSource() == fiveButtonMenu) {
            resultArea.setText(resultArea.getText() + "5");

        } else if (event.getSource() == sixButtonMenu) {
            resultArea.setText(resultArea.getText() + "6");

        } else if (event.getSource() == sevenButtonMenu) {
            resultArea.setText(resultArea.getText() + "7");

        } else if (event.getSource() == eightButtonMenu) {
            resultArea.setText(resultArea.getText() + "8");

        } else if (event.getSource() == nineButtonMenu) {
            resultArea.setText(resultArea.getText() + "9");

        } else if (event.getSource() == zeroButtonMenu) {
            resultArea.setText(resultArea.getText() + "0");

        } else if (event.getSource() == clearButtonMenu) {
            resultArea.clear();

        } else if (event.getSource() == enterButtonMenu) {
            ammount = Integer.parseInt(resultArea.getText());
            upLabel.setVisible(false);
            resultArea.setVisible(false);
            if (a >= ammount && ammount % 50 == 0 || ammount % 100 == 0 || ammount % 20 == 0) {
                actualBalance = a + ammount;

                accountLabel.setText("Operacja przebiegła pomyślnie" + " " + "Twój balans:" + actualBalance);
            } else {
                accountLabel.setText("Nie możesz wypłacić gotówki!");
            }

        }else if (event.getSource() == backButtonMenu) {
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
        }
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
