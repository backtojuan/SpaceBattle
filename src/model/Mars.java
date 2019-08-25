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
		public Mars(String n) {
			super(n);
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		public int[][] getSearchedMatrix(){
			return searchedmatrix;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		public void setSearchedMatrix(int[][] result) {
			searchedmatrix = result;
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
