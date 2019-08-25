//-----------------------------------------------------------------------------------------------------------------------------------------	
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.Assert.assertTrue;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.Test;
//-----------------------------------------------------------------------------------------------------------------------------------------
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
			
			int[][] result = new int[5][3];
			
			mars.setSearchedMatrix(result);
			
			assertEquals(result, mars.getSearchedMatrix(), "The matrices are not the same");
			assertNotNull(mars.getSearchedMatrix(), "The object is null as not expected");
			
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
