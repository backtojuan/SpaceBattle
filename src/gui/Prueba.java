package gui;

import model.Space;

public class Prueba {
	public static void main(String[]args) {
		Space s = new Space();
		s.createLastMatrix(5, 3);
		s.createCoefficientMatrix(2, 3);
		s.fillMatrices(false);
	}

}
