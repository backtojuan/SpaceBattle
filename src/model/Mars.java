	package model;

	public class Mars extends Planet{
		
		private int[][] searchedmatrix;
		
		public Mars(String n) {
			super(n);
		}
		
		public int[][] getSearchedMatrix(){
			return searchedmatrix;
		}
		
		public void setSearchedMatrix(int[][] result) {
			searchedmatrix = result;
		}
}
