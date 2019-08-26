//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.jupiter.api.Assertions.*;

import java.security.acl.LastOwnerException;

import org.junit.jupiter.api.Test;

import customexception.InvalidMatricesException;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to represent the venus participant in the spatial battle
	 */
	public class SpaceTest {
		
		private Space space;
		
		//Scenaries
		private void setUpScenary1() {
			
		}
		
		private void setUpScenary2() {
			space = new Space();
			
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testSpace() {
			setUpScenary1();
			
			Space space = new Space();
			
			assertNotNull(space, "The space is null as not expected");
			assertNotNull(space.getVenus(), "venus is null as not expected");
			assertNotNull(space.getMars(), "mars is null as not expected");
			
			assertEquals("Venus",space.getVenus().getName(), "The name of venus is not the expected one");
			assertEquals("Mars",space.getMars().getName(), "The name of mars is not the expected one");
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testGenerateBattleField(){
			setUpScenary2();
			
			Venus v = (Venus) space.getVenus();
			Mars m = (Mars) space.getMars();
			
			assertNull(v.getLastMatrix(), "The Matrix is not null as not expected ");
			assertNull(v.getCoefficientMatrix(), "The Matrix is not null as not expected ");
			assertNull(m.getSearchedMatrix(), "The Matrix is not null as not expected");
			
			
			//Case 1
			int[][] last = new int[5][3];
			int[][] coefficient = new int[3][5];
			
			v.setLast(last.length, last[0].length);
			v.setCoefficient(coefficient.length, coefficient[0].length);
			
			assertNotNull(v.getLastMatrix(), "The matrix is null as not expected");
			assertNotNull(v.getCoefficientMatrix(), "The matrix is null as not expected");
			
			v.fillRepeatedMatrix();
			space.generateBattleField();
							
			assertNotNull(m.getSearchedMatrix(), "The matrix is null as not expected");
			
			assertEquals(5, m.getSearchedMatrix().length, "The rows number is not the expected one");
			assertEquals(5, m.getSearchedMatrix()[0].length, "The columns number is not the expected one");
			
			for(int i=0;i<m.getSearchedMatrix().length;i++) {
				for(int j=0;j<m.getSearchedMatrix()[0].length;j++) {
					assertNotNull(m.getSearchedMatrix()[i][j],"The value is null as not expected");
				}
			}
			
			
			//Case 2
			int[][] last2 = new int[100][25];
			int[][] coefficient2 = new int[25][200];
			
			v.setLast(last.length, last[0].length);
			v.setCoefficient(coefficient.length, coefficient[0].length);
			
			assertNotNull(v.getLastMatrix(), "The matrix is null as not expected");
			assertNotNull(v.getCoefficientMatrix(), "The matrix is null as not expected");
			
			v.fillRepeatedMatrix();
			space.generateBattleField();
					
			assertNotNull(m.getSearchedMatrix(), "The matrix is null as not expected");
			
			for(int i=0;i<m.getSearchedMatrix().length;i++) {
				for(int j=0;j<m.getSearchedMatrix()[0].length;j++) {
					assertNotNull(m.getSearchedMatrix()[i][j],"The value is null as not expected");
				}
			}
			
		}
//-----------------------------------------------------------------------------------------------------------------------------------------	
}
