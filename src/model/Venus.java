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
		 * <b>Venus Constructor</b> 
		 * This method allows to create objects of type Venus
		 * @param n the name of the current venus planet
		 */
		public Venus(String n) {
			super(n);
			ally = new Planet("Earth");
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the ally that is supporting venus in the spatial battle
		 * <b>Pre:</b> Venus is not null
		 * @return the planet supporting venus
		 */
		public Planet getAlly() {
			return ally;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the known matrix of the last war in which venus participated.
		 * <b>Pre:</b> Venus is not null
		 * @return the last battle matrix
		 */
		public int[][] getLastMatrix(){
			return lastMatrix;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the known matrix of necessary movements to look for the current enemy spaceships
		 * <b>Pre:</b> Venus is not null
		 * @return the coefficient matrix
		 */
		public int[][] getCoefficientMatrix(){
			return coefficientMatrix;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method fill with values the last matrix known for venus
		 * <b>Pre:</b> Venus is not null
		 * <b>Post:</b> The lastbattle matrix is created with the right number of rows and columns
		 * @param row the desired number of rows that the matrix will have
		 * @param column the desired number of columns that the matrix will have
		 */
		public void last(int row, int column) {
			lastMatrix = new int[row][column];
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method fill with values the movements matrix 
		 * <b>Pre:</b> Venus is not null
		 * <b>Post:</b> The coefficient matrix is created with the right number of rows and columns
		 * @param row the desired number of rows that the matrix will have
		 * @param column the desired number of columns that the matrix will have
		 */
		public void coefficient(int row, int column) {
			coefficientMatrix = new int[row][column];
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method fill the matrices with non repeated elements if the user decided as that
		 * <b>Pre:</b> Venus is not null
		 * <b>Post:</b> The matrices are filled with the right values
		 */
		public void fillNonRepeatedMatrix() {
			for (int i=0; i < lastMatrix.length; i++) {
				  for (int j=0; j < lastMatrix[i].length; j++) {
					  lastMatrix[i][j] = (int) (Math.random()*100+1);
					  if(i>0 && j>0) {
						  if(lastMatrix[i][j] == lastMatrix[i-1][j-1]) {
							  lastMatrix[i][j] = (int) (Math.random()*100+1);
						  }
					  }
				  }
			}
			System.out.println();
			for (int i=0; i < coefficientMatrix.length; i++) {
				  for (int j=0; j < coefficientMatrix[i].length; j++) {
					  coefficientMatrix[i][j] = (int) (Math.random()*25+1);
					  if(i>0 && j>0) {
						  if(coefficientMatrix[i][j] == coefficientMatrix[i-1][j-1]) {
							  coefficientMatrix[i][j] = (int) (Math.random()*25+1);
						  }
					  }
				  }
			}
		}
		
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method fill the matrices with repeated elements if the user decided as that
		 * <b>Pre:</b> Venus is not null
		 * <b>Post:</b> The matrices are filled with the right values
		 */
		public void fillRepeatedMatrix(){
			
			//In the case that the user does not need repeated values inside the matrices
				for (int i=0; i < lastMatrix.length; i++) {
					  for (int j=0; j < lastMatrix[i].length; j++) {
						  lastMatrix[i][j] = (int) (Math.random()*100+1);
					  }
				}
				System.out.println();
				for (int i=0; i < coefficientMatrix.length; i++) {
					  for (int j=0; j < coefficientMatrix[i].length; j++) {
						  coefficientMatrix[i][j] = (int) (Math.random()*10+1);
					  }
				}
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
