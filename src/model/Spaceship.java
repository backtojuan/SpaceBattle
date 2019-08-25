//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create spaceships
	 */
	public class Spaceship {
		
		private int coordinatex;
		private int coordinatey;
		private int number;
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/** <b>Spaceship Constructor</b>
		 * This method allows to create objects of type Spaceship
		 * @param x the horizontal position of the spaceship
		 * @param y the vertical position of the spaceship
		 * @param n the represented value in the matrix
		 */
		public Spaceship(int x, int y, int n) {
			coordinatex = x;
			coordinatey = y;
			number = n;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the horizontal position of the spaceship
		 * <b>Pre:</b> The Spaceship is not null
		 * @return the horizontal position
		 */
		public int getX() {
			return coordinatex;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------		
		/**
		 * This method returns the vertical position of the spaceship
		 * <b>Pre:</b> The Spaceship is not null
		 * @return the vertical position
		 */
		public int getY() {
			return coordinatey;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------		
		/**
		 * This method returns the represented value of the spaceship
		 * <b>Pre:</b> The Spaceship is not null
		 * @return the value of the spaceship
		 */
		public int getNumber() {
			return number;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------		
		/**
		 * This method sets the value of the spaceship
		 * <b>Pre:</b> The Spaceship is not null
		 * <b>Post:</b> The value represented by the spaceship was set with no problem
		 */
		public void setNumber(int number) {
			this.number = number;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method sets the value of the spaceship
		 * <b>Pre:</b> The Spaceship is not null
		 * <b>Post:</b> The value represented by the spaceship was set with no problem
		 */
		public void setX(int x) {
			this.coordinatex = x;
			
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method sets the value of the spaceship
		 * <b>Pre:</b> The Spaceship is not null
		 * <b>Post:</b> The value represented by the spaceship was set with no problem
		 */
		public void setY(int y) {
			this.coordinatey = y;
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}