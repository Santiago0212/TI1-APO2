package main;

import java.io.File;
import java.io.IOException;

import control.EntryWelfareUniversity;
import control.VentanaA;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/EntryWelfareUniversity.fxml"));
		loader.setController(new EntryWelfareUniversity());
		Parent parent = (Parent) loader.load();
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setTitle("Cine ICESI");
		//stage.getIcons().add(new Image(""));
		stage.setScene(scene);
		stage.show();
		
		
	}

}
