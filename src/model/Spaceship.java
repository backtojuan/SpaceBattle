	package model;
	
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
	
		public Spaceship(int x, int y, int n) {
			x = coordinatex;
			y = coordinatey;
			n = number;
		}
		
		public int getX() {
			return coordinatex;
		}
		
		public int getY() {
			return coordinatey;
		}
		
		public int getNumber() {
			return number;
		}
	}