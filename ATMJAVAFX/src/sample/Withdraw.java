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

public class Withdraw extends Account implements Initializable {
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
    private Label debitLabel;

    @FXML
    private Label twentyLabel;

    @FXML
    private Label fiftyLabel;

    @FXML
    private Label oneHundredLabel;

    @FXML
    private Label fiveHundredLabel;

    @FXML
    private Label differentLabel;

    @FXML
    public TextArea resultArea;

    @FXML
    private Button twentyButton;

    @FXML
    private Button fiftyButton;

    @FXML
    private Button oneHundredButton;

    @FXML
    private Button fiveHundredButton;

    @FXML
    private Button differentButton;

    @FXML
    private Label actionLabel;

    @FXML
    private void handleButtonAction(ActionEvent event) {

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

        }
        if (event.getSource() == twentyButton) {
            double actualBalance;
            float ammount = 20;
            actualBalance = a + ammount;
            if (ammount >= 0) ;

            {
                this.a += ammount;
                actionLabel.setText("Action carried out successfully" + "Your actual balance:" + actualBalance);
                twentyButton.setMouseTransparent(true);
                fiftyButton.setMouseTransparent(true);
                oneHundredButton.setMouseTransparent(true);
                fiveHundredButton.setMouseTransparent(true);
                differentButton.setMouseTransparent(true);
                twentyLabel.setVisible(false);
                fiftyLabel.setVisible(false);
                oneHundredLabel.setVisible(false);
                fiveHundredLabel.setVisible(false);
                differentLabel.setVisible(false);


            }
        } else if (event.getSource() == fiftyButton) {
            double actualBalance;
            float ammount = 50;
            actualBalance = a + ammount;
            if (ammount >= 0) ;
            actionLabel.setText("Action carried out successfully" + "Your actual balance:" + actualBalance);
            twentyButton.setMouseTransparent(true);
            fiftyButton.setMouseTransparent(true);
            oneHundredButton.setMouseTransparent(true);
            fiveHundredButton.setMouseTransparent(true);
            differentButton.setMouseTransparent(true);
            twentyLabel.setVisible(false);
            fiftyLabel.setVisible(false);
            oneHundredLabel.setVisible(false);
            fiveHundredLabel.setVisible(false);
            differentLabel.setVisible(false);

        } else if (event.getSource() == oneHundredButton) {
            double actualBalance;
            float ammount = 100;
            actualBalance = a + ammount;
            if (ammount >= 0) ;
            actionLabel.setText("Action carried out successfully" + "Your actual balance:" + actualBalance);
            twentyButton.setMouseTransparent(true);
            fiftyButton.setMouseTransparent(true);
            oneHundredButton.setMouseTransparent(true);
            fiveHundredButton.setMouseTransparent(true);
            differentButton.setMouseTransparent(true);
            twentyLabel.setVisible(false);
            fiftyLabel.setVisible(false);
            oneHundredLabel.setVisible(false);
            fiveHundredLabel.setVisible(false);
            differentLabel.setVisible(false);

        } else if (event.getSource() == fiveHundredButton) {
            double actualBalance;
            float ammount = 500;
            actualBalance = a + ammount;
            if (ammount >= 0) ;
            actionLabel.setText("Action carried out successfully." + "Your actual balance:" + actualBalance);
            twentyButton.setMouseTransparent(true);
            fiftyButton.setMouseTransparent(true);
            oneHundredButton.setMouseTransparent(true);
            fiveHundredButton.setMouseTransparent(true);
            differentButton.setMouseTransparent(true);
            twentyLabel.setVisible(false);
            fiftyLabel.setVisible(false);
            oneHundredLabel.setVisible(false);
            fiveHundredLabel.setVisible(false);
            differentLabel.setVisible(false);

        } else if (event.getSource() == differentButton) {
            debitLabel.setVisible(true);
            resultArea.setVisible(true);
            debitLabel.setVisible(true);
            twentyLabel.setVisible(false);
            fiftyLabel.setVisible(false);
            oneHundredLabel.setVisible(false);
            fiveHundredLabel.setVisible(false);
            differentLabel.setVisible(false);
            twentyButton.setMouseTransparent(true);
            fiftyButton.setMouseTransparent(true);
            oneHundredButton.setMouseTransparent(true);
            fiveHundredButton.setMouseTransparent(true);


        } else if (event.getSource() == clearButtonMenu) {
            resultArea.clear();

        } else if (event.getSource() == backButtonMenu) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuATM.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("Menu");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }
        } else if (event.getSource() == enterButtonMenu) {
            debitLabel.setVisible(false);
            debitLabel.setVisible(false);
            resultArea.setVisible(false);

            double actualBalance;
            float ammount = Float.parseFloat(resultArea.getText());
            if ( a >= ammount && ammount % 50 == 0 || ammount % 100 == 0 || ammount % 20 == 0) {
                actualBalance = a - ammount;
                actionLabel.setText("Action carried out successfully!" + " " + "Your actual balance:" + actualBalance);
            } else  {
                actionLabel.setText("You dont have enough money or you are trying to withdraw cash!" + " " + " You can withdraw: " + a);
            }

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
