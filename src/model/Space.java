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
		

		
		/**public void generateMatrixToMultiply(boolean repeated){
			if(repeated == true) {
				for (int i=0; i < venus.getLastMatrix().length; i++) {
					  for (int j=0; j < venus.getLastMatrix()[i].length; j++) {
					    venus.getLastMatrix()[i][j] = (int) (Math.random()*100+1);
					    System.out.print(venus.getLastMatrix()[i][j] + "\t");
					  }
					  System.out.println();
				}
				System.out.print("\n");
				for (int i=0; i < venus.getCoefficientMatrix().length; i++) {
					  for (int j=0; j < venus.getCoefficientMatrix()[i].length; j++) {
						  venus.getCoefficientMatrix()[i][j] = (int) (Math.random()*9+1);
						  System.out.print(venuscoefficientMatrix[i][j] + "\t");
					  }
					  System.out.println();
				}
			}
			else {
				int i = 0;
				int random = lastMatrix.length*lastMatrix[i].length;
			    for (int j=0; j < lastMatrix[i].length; j++) {
					int counter = 0;
					while(counter < random) {
						lastMatrix[i][j] = random;
						System.out.print(lastMatrix[i][j] + "\t");
						random --;
					}
				}
			    System.out.print("\n");
			    int k = 0;
			    int rand = coefficientMatrix.length*coefficientMatrix[i].length;
				for (int l=0; l < coefficientMatrix[k].length; l++) {
					int counter = 0;
					while(counter < rand) {
						coefficientMatrix[i][k] = rand;
						System.out.print(coefficientMatrix[i][l] + "\t");
						rand --;
					}
				}
			}
		}
		
		
		public void createCoefficientMatrix(int row, int column) {
			coefficientMatrix = new int[row][column];  
		}
		
		public void createResultantMatrix(int row, int column) {
			lastMatrix = new int[row][column];  
		}*/
}
		