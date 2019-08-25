//-----------------------------------------------------------------------------------------------------------------------------------------	
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	import java.util.ArrayList;
	import java.util.List;

	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create planets
	 */
	public class Planet {
		
		private String name;
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/**
		 * 
		 * @param n
		 */
		public Planet(String n) {
			name = n;
		}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * 
		 * @return
		 */
		public String getName() {
			return name;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * 
		 * @param n
		 * @return
		 */
		public boolean isPrime(int n) {
			double number = Math.sqrt(n); 
			int noDecimal = (int) Math.round(number);
			if(number == noDecimal) {
				return false;
			}
			else {
				if(n%2 != 0 && n%3 != 0 && n%5 != 0 && n%7 != 0 && n%11 != 0 && n%13 != 0) {
					return true;
				}else {
					return false;
				}
			}
			
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}