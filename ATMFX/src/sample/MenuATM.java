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
    public Button clearButtonMenu;

    @FXML
    public Button cancelButtonMenu;

    @FXML
    public Button enterButtonMenu;

    @FXML
    public Button cardSlot;

    @FXML
    public Button witdhrawButtonMenu;

    @FXML
    public Button debitButtonMenu;

    @FXML
    public Button balanceButtonMenu;

    @FXML
    public Button exitButtonMenu;

    @FXML
    public Button backButtonMenu;

    @FXML
    public Button accountStatementButtonMenu;

    @FXML
    public Button logoutButtonMenu;

    @FXML
    public PasswordField pin;

    @FXML
    public Label withdrawLabel;

    @FXML
    public Label debitLabel;

    @FXML
    public Label balanceLabel;

    @FXML
    public Label accountLabel;

    @FXML
    public Label phoneLabel;

    @FXML
    public Label billLabel;

    @FXML
    public Label introcard;


    @FXML
    public Label upLabel;


    @FXML
    public TextArea resultArea;




    @FXML
    public void handleButtonAction(ActionEvent event) {

             if (event.getSource() == cancelButtonMenu){
                Stage stage = (Stage) cancelButtonMenu.getScene().getWindow();
                stage.close();

            }else if (event.getSource() == witdhrawButtonMenu) {
                try {
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("withdraw.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                    Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("Withdraw");
                    stage.show();
                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }

        }else if (event.getSource()== balanceButtonMenu){
                try {
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("balance.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                    Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("Balance");
                    stage.show();
                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }


        }else if (event.getSource()== debitButtonMenu){
                try {
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("debit.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                    Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("Debit");
                    stage.show();
                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }


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


        }else if (event.getSource()== logoutButtonMenu){
            try {
                ((Node) (event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("loggedOut.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Enter your PIN.");
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

