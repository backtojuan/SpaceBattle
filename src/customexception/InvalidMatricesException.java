//-----------------------------------------------------------------------------------------------------------------------------------------
	package customexception;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create exceptions where the user does not give a valid lenght for the 
	 * matrices
	 */
	public class InvalidMatricesException extends Exception{
		
		private int column;
		private int row;
		
		
	public InvalidMatricesException(int c, int r) {
		column = c;
		row = r;
	}
		
//----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * This method returns a personalized message for every considered exception case
	 */
	public String getMessage() {
		
		String mssg = "";
		
		if(row!=column) {
			mssg += "Columns number from first matrix must equals to Rows number from second matrix";
		}
		
		return mssg;
	}
//-----------------------------------------------------------------------------------------------------------------------------------------	
}
