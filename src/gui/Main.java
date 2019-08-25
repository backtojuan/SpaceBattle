//-----------------------------------------------------------------------------------------------------------------------------------------	
	package gui;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.image.Image;
	import javafx.stage.Stage;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create spaceships
	 */
	public class Main extends Application {
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		@Override
		public void start(Stage stage) throws Exception{
			
			Parent root = FXMLLoader.load(getClass().getResource("Space.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
			Image icon = new Image("gui/imgs/icon.png");
			stage.getIcons().addAll(icon);
			stage.setTitle("Spaceship Battle!!");
			
			stage.centerOnScreen();
			
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		
		public static void main (String args[]) {
			launch(args);
		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------	
}
