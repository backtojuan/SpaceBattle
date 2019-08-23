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

}