//-----------------------------------------------------------------------------------------------------------------------------------------
	package customexception;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create exceptions where the user enter wrong information
	 */
	public class InvalidInformationException extends Exception{
		
		private String report;
		
//----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * This method returns a personalized message for every considered exception case
	 */
	public String getMessage() {
		
		String mssg = "";
		
		if(report.equals(null) || report.equals("")) {
			mssg += "You cannot generate a battlefield if you havent ";
		}
		
		return mssg;
	}
//-----------------------------------------------------------------------------------------------------------------------------------------	
}
