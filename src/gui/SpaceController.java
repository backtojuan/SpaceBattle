//-----------------------------------------------------------------------------------------------------------------------------------------
	package gui;
import customexception.InvalidMatricesException;
import javafx.event.ActionEvent;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import model.Mars;
import model.Space;
import model.Venus;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create spaceships
	 */
	public class SpaceController {
	
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		@FXML
	    private TextField rows;

	    @FXML
	    private TextField columns;
	    
	    @FXML
	    private TextField rows1;
	    
	    @FXML
	    private AnchorPane anchor;

	    @FXML
	    private TextField columns1;

	    @FXML
	    void findSpaceships(ActionEvent event) {

	    }

	    @FXML
	    void generateBattleField(ActionEvent event) throws InvalidMatricesException {
	    	GridPane gridpane = new GridPane();
	    	GridPane gridpane2 = new GridPane();
	    	Space s = new Space();
	    	Venus v = (Venus) s.getVenus();
	    	int r = Integer.parseInt(rows.getText());
	    	int c = Integer.parseInt(columns.getText());
	    	int r1 = Integer.parseInt(rows1.getText());
	    	int c1 = Integer.parseInt(columns1.getText());
	    	v.setLast(r, c);
	    	v.setCoefficient(r1, c1);
	    	v.fillNonRepeatedMatrix();
	    	s.generateBattleField();
	    	for(int i = 0; i<v.getLastMatrix().length; i++) {
	    		for(int j = 0; j<v.getLastMatrix()[i].length; j++) {
	    			Label label = new Label();
	    			label.setText("" + v.getLastMatrix()[i][j] + "");
	    			System.out.print(v.getLastMatrix()[i][j] + "\t");
	    			gridpane.setConstraints(label, j, i);
	    			gridpane.getChildren().add(label);
	    		}
	    		System.out.print("\n");
	    	}
	    	System.out.print("\n");
	    	for(int i = 0; i<v.getCoefficientMatrix().length; i++) {
	    		for(int j = 0; j<v.getCoefficientMatrix()[i].length; j++) {
	    			Label label = new Label();
	    			label.setText("" + v.getCoefficientMatrix()[i][j] + "");
	    			System.out.print(v.getCoefficientMatrix()[i][j] + "\t");
	    			gridpane2.setConstraints(label, j, i);
	    			gridpane2.getChildren().add(label);
	    		}
	    		System.out.print("\n");
	    	}
	    	gridpane.setLayoutX(180);
	    	gridpane.setLayoutY(200);
	    	gridpane.setGridLinesVisible(true);
	    	anchor.getChildren().add(gridpane);
	    	gridpane2.setLayoutX(400);
	    	gridpane2.setLayoutY(200);
	    	gridpane2.setGridLinesVisible(true);
	    	anchor.getChildren().add(gridpane2);
	    	
	    }		
//-----------------------------------------------------------------------------------------------------------------------------------------	
}
