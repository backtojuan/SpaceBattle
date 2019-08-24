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
	}
