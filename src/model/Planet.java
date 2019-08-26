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
		 * <b>Planet Constructor</b> 
		 * This method creates planets as part of the space
		 * @param n
		 */
		public Planet(String n) {
			name = n;
		}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the name of the current planet
		 * @return name
		 */
		public String getName() {
			return name;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * This method determinates is a number is either prime or not, if it is it means that an spaceship
		 * is located in the coordinate (x,y)
		 * @param n the number to be verify
		 * @return a boolean determinant of the primeness
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