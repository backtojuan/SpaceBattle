//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to represent the venus participant in the spatial battle
	 */
	public class Venus extends Planet{
		
		private int[][] lastMatrix;
		private int[][] coefficientMatrix;
		private Planet ally;

//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/**
		 * Venus Constructor
		 * @param n the name of the current venus planet
		 */
		public Venus(String n) {
			super(n);
			ally = new Planet("Earth");
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the ally that is supporting venus in the spatial battle
		 * @return
		 */
		public Planet getAlly() {
			return ally;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the known matrix of the last war in which venus participated.
		 * @return
		 */
		public int[][] getLastMatrix(){
			return lastMatrix;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the known matrix of necessary movements to look for the current enemy spaceships
		 * @return
		 */
		public int[][] getCoefficientMatrix(){
			return coefficientMatrix;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method fill with values the last matrix known for venus
		 * @param row
		 * @param column
		 */
		public void last(int row, int column) {
			lastMatrix = new int[row][column];
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * 
		 * @param row
		 * @param column
		 */
		public void coefficient(int row, int column) {
			coefficientMatrix = new int[row][column];
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * 
		 */
		private void checkForNonRepited() {
			boolean flag = false;
			int i = 0;
			int j = 0;
			int counter = 0;
			
			while(!flag) {
				while(i<lastMatrix.length && j<coefficientMatrix.length) {
					if(lastMatrix[i][j] == lastMatrix[i+1][j+1]) {
						 lastMatrix[i][j] = (int) (Math.random()*500+1);
						 counter++;
					}
				}
				if(counter==0) {
					flag = true;
				}
			}
			
			while(!flag) {
				while(i<lastMatrix.length && j<coefficientMatrix.length) {
					if(coefficientMatrix[i][j] == coefficientMatrix[i+1][j+1]) {
						 coefficientMatrix[i][j] = (int) (Math.random()*500+1);
						 counter++;
					}
				}
				if(counter==0) {
					flag = true;
				}
			}
		}
		
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * 
		 * @param repeat
		 */
		public void fillMatrices(boolean repeat){
			
			//In the case that the user does not need repeated values inside the matrices
			if(repeat == true) {
				for (int i=0; i < lastMatrix.length; i++) {
					  for (int j=0; j < lastMatrix.length; j++) {
						  lastMatrix[i][j] = (int) (Math.random()*500+1);
					  }
				}
				for (int i=0; i < coefficientMatrix.length; i++) {
					  for (int j=0; j < coefficientMatrix[i].length; j++) {
						  coefficientMatrix[i][j] = (int) (Math.random()*9+1);
					  }
				}
				checkForNonRepited();
			}

			//In the case that the user need repeated values inside the matrices
			else {
				int random = lastMatrix.length*lastMatrix[0].length;
				for (int i=0; i < lastMatrix.length; i++) {
			         for (int j=0; j < lastMatrix[i].length; j++) {
			        	 lastMatrix[i][j] = random;
						random --;
				      }
				}

			    int rand = coefficientMatrix.length*coefficientMatrix[0].length;
			    for (int i=0; i < coefficientMatrix.length; i++) {
				    for (int j=0; j < coefficientMatrix[i].length; j++) {
				    	coefficientMatrix[i][j] = rand;
						rand --;
					}
				}
			}
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
