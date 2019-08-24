	package model;
	
	public class Venus extends Planet{
		
		
		private int[][] lastMatrix;
		private int[][] coefficientMatrix;
		
		public Venus(String n) {
			super(n);
		}
		
		public int[][] getLastMatrix(){
			return lastMatrix;
		}
		
		public int[][] getCoefficientMatrix(){
			return coefficientMatrix;
		}
		public void last(int row, int column) {
			lastMatrix = new int[row][column];
		}
		public void coefficient(int row, int column) {
			coefficientMatrix = new int[row][column];
		}
	}
