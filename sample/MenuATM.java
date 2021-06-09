package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MenuATM implements Initializable {
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
    private Button cardSlot;

    @FXML
    private Button witdhrawButtonMenu;

    @FXML
    private Button debitButtonMenu;

    @FXML
    private Button balanceButtonMenu;

    @FXML
    private Button exitButtonMenu;

    @FXML
    private Button backButtonMenu;

    @FXML
    private Button accountStatementButtonMenu;

    @FXML
    private PasswordField pin;

    @FXML
    private Label withdrawLabel;

    @FXML
    private Label debitLabel;

    @FXML
    private Label balanceLabel;

    @FXML
    private Label accountLabel;

    @FXML
    private Label phoneLabel;

    @FXML
    private Label billLabel;

    @FXML
    private Label introcard;


    @FXML
    private Label upLabel;


    @FXML
    private TextArea resultArea;




    @FXML
    public void handleButtonAction(ActionEvent event) {

            if (event.getSource() == oneButtonMenu) {
                resultArea.setText(resultArea.getText() + "1");

            }else if (event.getSource() == twoButtonMenu) {
                resultArea.setText(resultArea.getText() + "2");

            }else if (event.getSource() == threeButtonMenu) {
                resultArea.setText(resultArea.getText() + "3");

            }else if (event.getSource() == fourButtonMenu) {
                resultArea.setText(resultArea.getText() + "4");

            }else if (event.getSource() == fiveButtonMenu) {
                resultArea.setText(resultArea.getText() + "5");

            }else if (event.getSource() == sixButtonMenu) {
                resultArea.setText(resultArea.getText() + "6");

            }else if (event.getSource() == sevenButtonMenu) {
                resultArea.setText(resultArea.getText() + "7");

            }else if (event.getSource() == eightButtonMenu) {
                resultArea.setText(resultArea.getText() + "8");

            }else if (event.getSource() == nineButtonMenu) {
                resultArea.setText(resultArea.getText() + "9");

            }else if (event.getSource() == zeroButtonMenu) {
                resultArea.setText(resultArea.getText() + "0");

            }else if (event.getSource() == enterButtonMenu) {




            }else if (event.getSource() == clearButtonMenu) {
                resultArea.clear();

            }else if (event.getSource() == cancelButtonMenu){
                Stage stage = (Stage) cancelButtonMenu.getScene().getWindow();
                stage.close();

            }else if (event.getSource() == witdhrawButtonMenu) {
            withdrawLabel.setVisible(false);
            witdhrawButtonMenu.setMouseTransparent(true);
            accountStatementButtonMenu.setMouseTransparent(true);
            accountLabel.setVisible(false);
            balanceButtonMenu.setVisible(false);
            balanceButtonMenu.setMouseTransparent(true);
            debitLabel.setVisible(false);
            resultArea.setVisible(true);
            upLabel.setText("");

        }else if (event.getSource()== balanceButtonMenu){
                withdrawLabel.setVisible(false);
                witdhrawButtonMenu.setMouseTransparent(true);
                accountStatementButtonMenu.setMouseTransparent(true);
                accountLabel.setVisible(false);
                balanceButtonMenu.setVisible(false);
                balanceButtonMenu.setMouseTransparent(true);
                debitLabel.setVisible(false);
                resultArea.setVisible(true);
                upLabel.setText("");


        }else if (event.getSource()== debitButtonMenu){
                withdrawLabel.setVisible(false);
                witdhrawButtonMenu.setMouseTransparent(true);
                accountStatementButtonMenu.setMouseTransparent(true);
                accountLabel.setVisible(false);
                balanceButtonMenu.setVisible(false);
                balanceButtonMenu.setMouseTransparent(true);
                debitLabel.setVisible(false);
                resultArea.setVisible(true);
                upLabel.setText("");

        }else if (event.getSource()== accountStatementButtonMenu){
                withdrawLabel.setVisible(false);
                witdhrawButtonMenu.setMouseTransparent(true);
                accountStatementButtonMenu.setMouseTransparent(true);
                accountLabel.setVisible(false);
                balanceButtonMenu.setVisible(false);
                balanceButtonMenu.setMouseTransparent(true);
                debitLabel.setVisible(false);
                resultArea.setVisible(true);
                upLabel.setText("");

        }else if (event.getSource()== backButtonMenu){
            try {
                ((Node) (event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("menuATM.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Welcome in our services!");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);

            }


        }else if (event.getSource()== exitButtonMenu){
            pin.clear();
            try {
                ((Node) (event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("sample.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Welcome in our services!");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }




            }
        }
        @Override
        public void initialize (URL url, ResourceBundle resourceBundle){

        }
    }

