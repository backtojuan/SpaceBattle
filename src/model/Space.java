package model;

public class Space {
private Planet venus;
private Planet mars;
private int[][] lastMatrix;
private int[][] coefficientMatrix;

public Space () {

}

public Planet getVenus() {
return venus;
}

public Planet getMars() {
return mars;
}

public int[][] getLastMatrix(){
return lastMatrix;
}

public int[][] getCoefficientMatrix(){
return coefficientMatrix;
}

public int[][] generateBattleMatrix(){
int[][] battleMatrix = new int[numberOfRown()][numberOfColumn()];
return battleMatrix;
}

public void createLastMatrix(int row, int column) {
lastMatrix = new int[row][column];  
}

public void createCoefficientMatrix(int row, int column) {
coefficientMatrix = new int[row][column];  
}

public int numberOfRown() {
	int numberOfRown = 0;
	return numberOfRown;
}

public int numberOfColumn() {
	int numberOfColumn = 0;
	return numberOfColumn;
}
public void fillMatrices(boolean repeat){
	if(repeat == true) {
		for (int i=0; i < lastMatrix.length; i++) {
			  for (int j=0; j < lastMatrix[i].length; j++) {
			    lastMatrix[i][j] = (int) (Math.random()*100+1);
			    System.out.print(lastMatrix[i][j] + "\t");
			  }
			  System.out.println();
		}
		System.out.print("\n");
		for (int i=0; i < coefficientMatrix.length; i++) {
			  for (int j=0; j < coefficientMatrix[i].length; j++) {
				  coefficientMatrix[i][j] = (int) (Math.random()*9+1);
				  System.out.print(coefficientMatrix[i][j] + "\t");
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
}