package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Menu {

    @FXML
    private Button registerFunctionBTN;

    @FXML
    private Button registerClientBTN;

    @FXML
    void registerClient(ActionEvent event) {

    }

    @FXML
    void registerFunction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(EntryWelfareUniversity.class.getResource("../ui/RegisterFunctions.fxml"));
		loader.setController(new RegisterFunctions());
		Parent parent = (Parent) loader.load();
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
		
		Stage stage1 = (Stage) registerFunctionBTN.getScene().getWindow();
	    stage1.close();
    }

}
