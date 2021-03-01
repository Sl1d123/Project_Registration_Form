package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoginController {

    private Button cancelButton;

    public void cancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
