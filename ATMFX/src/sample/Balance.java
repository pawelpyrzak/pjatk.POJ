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

public class Balance  implements Initializable {
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
    private TextArea resultArea;

    @FXML
    private Label upLabel;

    @FXML
    private Label accountLabel1;



    @FXML
    private void handleButtonAction(ActionEvent event) {
     if (event.getSource()== backButtonMenu) {

         try {
             ((Node) (event.getSource())).getScene().getWindow().hide();
             FXMLLoader fxmlLoader = new FXMLLoader();
             fxmlLoader.setLocation(getClass().getResource("menuATM.fxml"));
             Scene scene = new Scene(fxmlLoader.load(), 560, 420);
             Stage stage = new Stage();
             stage.setScene(scene);
             stage.setTitle("Enter your PIN.");
             stage.show();
         } catch (IOException e) {
             System.out.println("Failed to create new Window." + e);
         }
     }else if(event.getSource()==oneButtonMenu){
         accountLabel1.setVisible(false);
         accountLabel.setVisible(true);
         upLabel.setText(""+a);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

