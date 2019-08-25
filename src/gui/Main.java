package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	
	public void start(Stage stage) throws Exception{
		
		Parent root = FXMLLoader.load(getClass().getResource("Space.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Image icon = new Image("gui/imgs/icon.png");
		stage.getIcons().addAll(icon);
		stage.setTitle("Spaceship Battle!!");
		
		
	}
	
	public static void main (String args[]) {
		launch(args);
	}
	

}
