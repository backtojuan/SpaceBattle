//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to represent the mars participant in the spatial battle
	 */
	public class Mars extends Planet{
		
		private int[][] searchedmatrix;
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/**
		 * <b>Mars Constructor</b>
		 * This method allows to create objects of type Mars
		 * @param n the name of the current mars planet 
		 */
		public Mars(String n) {
			super(n);
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the searched matrix of enemy spaceships from mars
		 * <b>Pre:</b> Mars is not null
		 * <b>Post:</b>
		 * @return
		 */
		public int[][] getSearchedMatrix(){
			return searchedmatrix;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * This method sets the obtained matrix from venus as the current matrix of the battlefield
		 * <b>Pre:</b> Mars is not null
		 * <b>Post:</b>
		 * @param result
		 */
		public void setSearchedMatrix(int[][] result) {
			searchedmatrix = result;
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
