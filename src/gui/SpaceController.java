//-----------------------------------------------------------------------------------------------------------------------------------------
	package gui;
import customexception.InvalidMatricesException;
import javafx.event.ActionEvent;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import model.Mars;
import model.Space;
import model.Spaceship;
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
	    
	    private Space s;
	    private Venus v;
	    private Mars m;
	    @FXML
	    void findSpaceships(ActionEvent event) throws InvalidMatricesException {
	    	m = (Mars) s.getMars();
	    	s.generateBattleField();
	    	GridPane gridpane = new GridPane();
	    	GridPane gridpane2 = new GridPane();
	    	for(int i = 0; i<m.getSearchedMatrix().length; i++) {
	    		for(int j = 0; j<m.getSearchedMatrix()[i].length; j++) {
	    			Label label = new Label();
	    			label.setText("" + m.getSearchedMatrix()[i][j] + "");
	    			gridpane2.setConstraints(label, j, i);
	    			gridpane2.getChildren().add(label);
	    			int n = m.getSearchedMatrix()[i][j];
	    			if(m.isPrime(n) == true) {
	    				Spaceship s = new Spaceship(i,j,n);
	    				System.out.println("Nave n°: " + n + " En las coordenadas (" +  i+ ", " + j + ")");
	    				String image = "gui/imgs/icon.png";
	    				Image im = new Image(image);
	    				ImageView img = new ImageView(im);
	    				img.setFitHeight(10);
	    				img.setFitWidth(10);
	    				gridpane2.setConstraints(img, j, i);
		    			gridpane2.getChildren().add(img);
	    				
	    			}
	    		}
	    		System.out.print("\n");
	    	}
	    	gridpane2.setLayoutX(500);
	    	gridpane2.setLayoutY(200);
	    	gridpane2.setGridLinesVisible(true);
	    	anchor.getChildren().add(gridpane2);
	    }
	    void generateNoRepeat() {
	    	int r = Integer.parseInt(rows.getText());
	    	int c = Integer.parseInt(columns.getText());
	    	int r1 = Integer.parseInt(rows1.getText());
	    	int c1 = Integer.parseInt(columns1.getText());
	    	s = new Space();
	    	v = (Venus) s.getVenus();
	    	v.setLast(r, c);
	    	v.setCoefficient(r1, c1);
	    	v.fillNonRepeatedMatrix();
	    }
	    void generateRepeat() {
	    	int r = Integer.parseInt(rows.getText());
	    	int c = Integer.parseInt(columns.getText());
	    	int r1 = Integer.parseInt(rows1.getText());
	    	int c1 = Integer.parseInt(columns1.getText());
	    	s = new Space();
	    	v = (Venus) s.getVenus();
	    	v.setLast(r, c);
	    	v.setCoefficient(r1, c1);
	    	v.fillRepeatedMatrix();
	    }

	    @FXML
	    void generateBattleField(ActionEvent event) throws InvalidMatricesException {
	    	generateNoRepeat();
	    	GridPane gridpane = new GridPane();
	    	GridPane gridpane2 = new GridPane();
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
