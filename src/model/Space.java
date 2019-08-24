	package model;
	
	public class Space {
		
		private Venus venus;
		private Mars mars;
		
		
		
		public Space () {
			venus = new Venus("Venus");
			mars = new Mars("Mars");
		}
		
		public Planet getVenus() {
			return venus;
		}
		
		public Planet getMars() {
			return mars;
		}
		public void fillMatrices(boolean repeat){
			if(repeat == true) {
				for (int i=0; i < venus.getLastMatrix().length; i++) {
					  for (int j=0; j < venus.getLastMatrix()[i].length; j++) {
						  venus.getLastMatrix()[i][j] = (int) (Math.random()*100+1);
					  }
				}
				for (int i=0; i < venus.getCoefficientMatrix().length; i++) {
					  for (int j=0; j < venus.getCoefficientMatrix()[i].length; j++) {
						  venus.getCoefficientMatrix()[i][j] = (int) (Math.random()*9+1);
					  }
				}
			}
			else {
				int random = venus.getLastMatrix().length*venus.getLastMatrix()[0].length;
				for (int i=0; i < venus.getLastMatrix().length; i++) {
			         for (int j=0; j < venus.getLastMatrix()[i].length; j++) {
			        	 venus.getLastMatrix()[i][j] = random;
						random --;
				      }
				}

			    int rand = venus.getCoefficientMatrix().length*venus.getCoefficientMatrix()[0].length;
			    for (int i=0; i < venus.getCoefficientMatrix().length; i++) {
				    for (int j=0; j < venus.getCoefficientMatrix()[i].length; j++) {
				    	venus.getCoefficientMatrix()[i][j] = rand;
						rand --;
					}
				}
			}
		}
		public void currentBattle(){
			int[][] m1 = venus.getLastMatrix();
			int[][] m2 = venus.getCoefficientMatrix();
			int fil_m1 = m1.length;
			int col_m1 = m1[0].length;
			int fil_m2 = m2.length;
			int col_m2 = m2[0].length;
			if (col_m1 != fil_m2)
				  throw new RuntimeException("Matrices cannot be multiplied");
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
		public void prueba() {
			venus.last(5, 4);
			venus.coefficient(4, 3);
			fillMatrices(false);
			currentBattle();
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
}
		