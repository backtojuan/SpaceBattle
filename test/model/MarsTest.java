//-----------------------------------------------------------------------------------------------------------------------------------------	
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.Assert.assertTrue;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.Test;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to represent the venus participant in the spatial battle
	 */
	public class MarsTest {
		
		private Mars mars;
		
		//Scenaries
		public void setUpScenary1() {
			
		}
		
		public void setUpScenary2() {
			mars = new Mars("Mars");
		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------	
		@Test
	    public void testMars() {
			
			setUpScenary1();
			Mars mars = new Mars("Mars");
			
			assertNotNull(mars,"The spaceship is null as not expected");
			
			assertEquals("Mars", mars.getName(), "The name is not the expected one");
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testSearchedMatrix() {
			
			setUpScenary2();
			
			assertNull(mars.getSearchedMatrix(), "The object is not null as not expected");
			
			//Case 1
			int[][] result = new int[5][3];
			
			mars.setSearchedMatrix(result);
			
			assertEquals(result, mars.getSearchedMatrix(), "The matrices are not the same");
			assertNotNull(mars.getSearchedMatrix(), "The object is null as not expected");
			
			//Case 2
			int[][] result2 = new int[100][250];
			
			mars.setSearchedMatrix(result2);
			
			assertEquals(result2, mars.getSearchedMatrix(), "The matrices are not the same");
			assertNotNull(mars.getSearchedMatrix(), "The object is null as not expected");
			
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
