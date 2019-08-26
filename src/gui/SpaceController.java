//-----------------------------------------------------------------------------------------------------------------------------------------
	package gui;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
	import javafx.geometry.Pos;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.AnchorPane;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.Pane;
	import javafx.stage.Modality;
	import javafx.stage.Stage;
	import javafx.util.Duration;
	import java.io.IOException;
	import org.controlsfx.control.Notifications;
	import javafx.scene.control.ScrollPane;
	import customexception.InvalidInformationException;
	import customexception.InvalidMatricesException;
	import javafx.event.ActionEvent;
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
		 *  This class manage the necessary attributes and methods to the correct visualization of the User's GUI
		 */
		public class SpaceController {
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		    
			@FXML
		    private TextField lastRows;
		    
			@FXML
		    private TextField lastColumns;
		    
		    @FXML
		    private TextField coeRows;
		    
		    @FXML
		    private TextField coeColumns;
		    
		    @FXML
		    private ScrollPane lastScrollPane;
		
		    @FXML
		    private ScrollPane coeScrollPane;
		
		    @FXML
		    private ScrollPane resultScrollpane;
		    
		    //Second window to represent the matrices product
		    private GridPane lastgridpane;
		    private GridPane coegridpane;
		   
		    private Space s;
		    private Venus v;
		    private Mars m;
		    
//-----------------------------------------------------------------------------------------------------------------------------------------
		@FXML
		/**
		 * 
		 */
		public void initialize() {
			s = new Space();
			v = (Venus) s.getVenus();
		}    
	//-------------------------------------------------------------------------------------------------------------------------------------
		@FXML
		/**
		 * 
		 * @param event
		 * @throws InvalidMatricesException
		 */
		private void findSpaceships(ActionEvent event) throws InvalidMatricesException {
		    	m = (Mars) s.getMars();
		    	
		}
	 //-------------------------------------------------------------------------------------------------------------------------------------

	    @FXML
	    /**
	     * 
	     * @param event
	     */
	    private void generateNonRepeatedBattleField(ActionEvent event){
	    	try {
	    		generateNonRepeatedMatrix();
	    	}
	    	catch(InvalidInformationException iie) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text(iie.getMessage())
	    		.showWarning()
	    		;
	    	}
	    	catch(InvalidMatricesException ime) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text(ime.getMessage())
	    		.showWarning()
	    		;
	    	}	
	    	try {
		    	
		    	lastgridpane = new GridPane();
		    	lastgridpane.setGridLinesVisible(true);
		    	
		    	coegridpane = new GridPane();
		    	coegridpane.setGridLinesVisible(true);
		    	
		    	System.out.println(v);
		    	System.out.println(v.getLastMatrix());
		
			    	for(int i = 0; i<v.getLastMatrix().length; i++) {
			    		for(int j = 0; j<v.getLastMatrix()[i].length; j++) {
			    			Button button = new Button();
			    			button.setMaxSize(200.0, 150.0);
			    			button.setStyle("-fx-background-color : SLATEGRAY");
			    			button.setText("" + v.getLastMatrix()[i][j] + "");
			    			System.out.print(v.getLastMatrix()[i][j] + "\t");
			    			GridPane.setConstraints(button, j, i);
			    			lastgridpane.getChildren().add(button);
			    		}
			    		System.out.print("\n");
			    	}
			    	
			    	System.out.print("\n");
			    	for(int i = 0; i<v.getCoefficientMatrix().length; i++) {
			    		for(int j = 0; j<v.getCoefficientMatrix()[i].length; j++) {
			    			Button button = new Button();
			    			button.setMaxSize(200.0, 150.0);
			    			button.setStyle("-fx-background-color : SLATEGRAY");
			    			button.setText("" + v.getCoefficientMatrix()[i][j] + "");
			    			System.out.print(v.getCoefficientMatrix()[i][j] + "\t");
			    			GridPane.setConstraints(button, j, i);
			    			coegridpane.getChildren().add(button);
			    		}
			    		System.out.print("\n");
			    	}
			    	
			  lastScrollPane.setContent(lastgridpane);
			  coeScrollPane.setContent(coegridpane);
			  
			  
			  //Resultant Matrix
			  s.generateBattleField();
		    	GridPane gridpane = new GridPane();
		    	for(int i = 0; i<m.getSearchedMatrix().length; i++) {
		    		for(int j = 0; j<m.getSearchedMatrix()[i].length; j++) {
		    			Label label = new Label();
		    			label.setText("" + m.getSearchedMatrix()[i][j] + "");
		    			System.out.print(m.getSearchedMatrix()[i][j] + "\t");
		    			GridPane.setConstraints(label, j, i);
		    		}
		    		System.out.print("\n");
		    	}
		    	gridpane.setLayoutX(600);
		    	gridpane.setLayoutY(200);
		    	gridpane.setGridLinesVisible(true);
		    	resultScrollpane.setContent(gridpane);
		    	
	    }
		catch(NullPointerException npe) {
			  Notifications.create()
			  .title("WARNING")
			  .darkStyle()
			  .hideCloseButton()
			  .text(" Matrix cannot be generated. Check that you are entering and valid information ")
			  .showWarning()
			   ;
			}
	    }  
	 //------------------------------------------------------------------------------------------------------------------------------------  
	    @FXML
	    /**
	     * 
	     * @param event
	     */
	    private void generateRepeatedBattleField(ActionEvent event) {
	    	try {
	    		generateRepeatedMatrix();
	    	}
	    	catch(InvalidInformationException iie) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text(iie.getMessage())
	    		.showWarning()
	    		;
	    	}
	    	catch(InvalidMatricesException ime) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text(ime.getMessage())
	    		.showWarning()
	    		;
	    	}
	    	try {
		    	
		    	lastgridpane = new GridPane();
		    	lastgridpane.setGridLinesVisible(true);
		    	
		    	coegridpane = new GridPane();
		    	coegridpane.setGridLinesVisible(true);

			    	for(int i = 0; i<v.getLastMatrix().length; i++) {
			    		for(int j = 0; j<v.getLastMatrix()[i].length; j++) {
			    			Button button = new Button();
			    			button.setMaxSize(200.0, 150.0);
			    			button.setStyle("-fx-background-color : SLATEGRAY");
			    			button.setText("" + v.getLastMatrix()[i][j] + "");
			    			System.out.print(v.getLastMatrix()[i][j] + "\t");
			    			GridPane.setConstraints(button, j, i);
			    			lastgridpane.getChildren().add(button);
			    		}
			    		System.out.print("\n");
			    	}
			    	
			    	System.out.print("\n");
			    	for(int i = 0; i<v.getCoefficientMatrix().length; i++) {
			    		for(int j = 0; j<v.getCoefficientMatrix()[i].length; j++) {
			    			Button button = new Button();
			    			button.setMaxSize(200.0, 150.0);
			    			button.setStyle("-fx-background-color : SLATEGRAY");
			    			button.setText("" + v.getCoefficientMatrix()[i][j] + "");
			    			System.out.print(v.getCoefficientMatrix()[i][j] + "\t");
			    			GridPane.setConstraints(button, j, i);
			    			coegridpane.getChildren().add(button);
			    		}
			    		System.out.print("\n");
			    	} 
			    	
			    lastScrollPane.setContent(lastgridpane);
			    coeScrollPane.setContent(coegridpane);
			    	
				//Resultant Matrix
				  s.generateBattleField();
			    	GridPane gridpane = new GridPane();
			    	for(int i = 0; i<m.getSearchedMatrix().length; i++) {
			    		for(int j = 0; j<m.getSearchedMatrix()[i].length; j++) {
			    			Label label = new Label();
			    			label.setText("" + m.getSearchedMatrix()[i][j] + "");
			    			System.out.print(m.getSearchedMatrix()[i][j] + "\t");
			    			GridPane.setConstraints(label, j, i);
			    		}
			    		System.out.print("\n");
			    	}
			    	gridpane.setLayoutX(600);
			    	gridpane.setLayoutY(200);
			    	gridpane.setGridLinesVisible(true);
			    	resultScrollpane.setContent(gridpane);
			    	
	    	}   	
	    	catch(NullPointerException npe) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text(" Matrix cannot be generated. Check that you are entering and valid information ")
	    		.showWarning()
	    		;
	    	}
	    }
	    
	//-------------------------------------------------------------------------------------------------------------------------------------
	    /**
	     * 
	     * @throws InvalidMatricesException
	     * @throws InvalidInformationException
	     */
	    private void generateNonRepeatedMatrix() throws InvalidMatricesException, InvalidInformationException {
	    	
	    	if(lastRows.getText().equals("") || lastColumns.getText().equals("")
	    			|| coeRows.getText().equals("") || coeColumns.getText().equals("")) {
	    		throw new InvalidInformationException("");
	    	}
	    	
	    	int lastrow = Integer.parseInt(lastRows.getText());
	    	int lastcolumn = Integer.parseInt(lastColumns.getText());
	    	int coefficientrow = Integer.parseInt(coeRows.getText());
	    	int coefficientcolumn = Integer.parseInt(coeColumns.getText());
	    	
	    	if(lastcolumn!=coefficientrow) {
	    		throw new InvalidMatricesException(lastcolumn,coefficientrow);
	    	}
	    	
	    		v = (Venus) s.getVenus();
	    		v.setLast(lastrow, lastcolumn);
	    		v.setCoefficient(coefficientrow, coefficientcolumn);
	    		v.fillNonRepeatedMatrix();
	    }
	 
	 //------------------------------------------------------------------------------------------------------------------------------------
	    /**
	     * 
	     * @throws InvalidMatricesException
	     * @throws InvalidInformationException
	     */
	    private void generateRepeatedMatrix() throws InvalidMatricesException, InvalidInformationException {
	    	
	    	if(lastRows.getText().equals("") || lastColumns.getText().equals("")
	    			|| coeRows.getText().equals("") || coeColumns.getText().equals("")) {
	    		throw new InvalidInformationException("");
	    	}
	    	
		    int lastrow = Integer.parseInt(lastRows.getText());
		    int lastcolumn = Integer.parseInt(lastColumns.getText());
		    int coefficientrow = Integer.parseInt(coeRows.getText());
		    int coefficientcolumn = Integer.parseInt(coeColumns.getText());
		    	
	    	if(lastcolumn!=coefficientrow) {
	    		throw new InvalidMatricesException(lastcolumn,coefficientrow);
	    	}
		    	v.setLast(lastrow, lastcolumn);
		    	v.setCoefficient(coefficientrow, coefficientcolumn);
		    	v.fillRepeatedMatrix();
	    }

//-----------------------------------------------------------------------------------------------------------------------------------------	
}
