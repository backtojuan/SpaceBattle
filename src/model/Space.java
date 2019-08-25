//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordo�ez Ordo�ez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create the space as the part of the battlefield
	 */
	public class Space {
		
		private Venus venus;
		private Mars mars;
	
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		public Space () {
			venus = new Venus("Venus");
			mars = new Mars("Mars");
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		public Planet getVenus() {
			return venus;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		public Planet getMars() {
			return mars;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		public void generateBattleField(){
			
			int[][] m1 = venus.getLastMatrix();
			int[][] m2 = venus.getCoefficientMatrix();
			int fil_m1 = m1.length;
			int col_m1 = m1[0].length;
			int fil_m2 = m2.length;
			int col_m2 = m2[0].length;
			
			if (col_m1 != fil_m2) {
				  throw new RuntimeException("Matrices cannot be multiplied");
			}
			
			int[][] current = new int[fil_m1][col_m2];
			System.out.println();
			for (int i=0; i < current.length; i++) {
				  for(int j = 0; j<current[i].length; j++) {
					  for (int k=0; k<col_m1; k++) {
						     current[i][j] += m1[i][k]*m2[k][j]; 
						  }
				  }
			}
			mars.setSearchedMatrix(current);
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		public void prueba() {
			venus.setLast(5, 4);
			venus.setCoefficient(4, 3);
			venus.fillNonRepeatedMatrix();
			generateBattleField();
			for(int i = 0; i< venus.getLastMatrix().length; i++) {
				for(int j = 0; j<venus.getLastMatrix()[i].length;j++) {
					System.out.print(venus.getLastMatrix()[i][j] + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
			for(int i = 0; i< venus.getCoefficientMatrix().length; i++) {
				for(int j = 0; j<venus.getCoefficientMatrix()[i].length;j++) {
					System.out.print(venus.getCoefficientMatrix()[i][j] + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
			for(int i = 0; i< mars.getSearchedMatrix().length; i++) {
				for(int j = 0; j<mars.getSearchedMatrix()[i].length;j++) {
					System.out.print(mars.getSearchedMatrix()[i][j] + "\t");
				}
				System.out.print("\n");
			}
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
		