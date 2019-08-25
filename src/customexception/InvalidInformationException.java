	package customexception;

	public class InvalidInformationException extends Exception{

		
	public String getMessage(String report) {
		
		String mssg = "";
		
		if(report.equals(null) || report.equals("")) {
			mssg += "You cannot generate a battlefield if you havent ";
		}
		
		
		
		return mssg;
	}
	
}
