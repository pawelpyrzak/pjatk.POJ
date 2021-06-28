package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BalancePl  implements Initializable {
    Account account = new Account();
    int a = account.balance;


    @FXML
    private Button oneButtonMenu;

    @FXML
    private Button backButtonMenu;

    @FXML
    private Label accountLabel;

    @FXML
    private Label upLabel1;

    @FXML
    private Label accountLabel1;

    @FXML
    private Label accountLabel2;




    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()== backButtonMenu) {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuATMpl.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 560, 420);
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("Menu");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }

        }else if(event.getSource()==oneButtonMenu){
            accountLabel1.setVisible(false);
            accountLabel.setVisible(true);
            accountLabel2.setVisible(true);
            upLabel1.setText(""+a);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

