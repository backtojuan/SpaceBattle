//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;

import customexception.InvalidMatricesException;

//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create the space as the part of the battlefield
	 */
	public class Space {
		
		private Venus venus;
		private Mars mars;
	
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/**
		 * <b>Space Constructor</b>
		 * This method allows to create the space as an scenerio to deliver the battle
		 */
		public Space () {
			venus = new Venus("Venus");
			mars = new Mars("Mars");
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * 
		 * @return
		 */
		public Planet getVenus() {
			return venus;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * 
		 * @return
		 */
		public Planet getMars() {
			return mars;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * @throws InvalidMatricesException 
		 * @throws NullPointerException
		 */
		public void generateBattleField(){
			
			int[][] m1 = venus.getLastMatrix();
			int[][] m2 = venus.getCoefficientMatrix();
			int fil_m1 = m1.length;
			int col_m1 = m1[0].length;
			int fil_m2 = m2.length;
			int col_m2 = m2[0].length;
						
			int[][] current = new int[fil_m1][col_m2];
			
			for (int i=0; i < current.length; i++) {
				  for(int j = 0; j<current[i].length; j++) {
					  for (int k=0; k<col_m1; k++) {
						     current[i][j] += m1[i][k]*m2[k][j]; 
						  }
				  }
			}
			mars.setSearchedMatrix(current);
		}	
//-----------------------------------------------------------------------------------------------------------------------------------------
}
		