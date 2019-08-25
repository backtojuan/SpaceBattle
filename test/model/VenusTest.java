	//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
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
	public class VenusTest {
		
		private Venus venus;
		
		public void setUpScenary1() {
			
		}
		
		public void setUpScenary2() {
			venus = new Venus("Venus");
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testVenus() {
			
			setUpScenary1();
			Venus venus = new Venus("Venus");
			
			assertNotNull(venus,"The spaceship is null as not expected");
			
			assertEquals("Venus", venus.getName(), "The name is not the expected one");
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testMatrices() {
			
			setUpScenary2();
			
			assertNull(venus.getLastMatrix(), "The object is not null as not expected");
			assertNull(venus.getCoefficientMatrix(), "The object is not null as not expected");
		
			//Case 1
			venus.setLast(8, 5);
			venus.setCoefficient(5,10);
			
			assertNotNull(venus.getLastMatrix(), "The matrix is null as not expected");
			assertNotNull(venus.getCoefficientMatrix(), "The matrix is null as not expected");
			
			assertEquals(8, venus.getLastMatrix().length, "the rows number is not the expected one");
			assertEquals(5, venus.getLastMatrix()[0].length, "the columns number is not the expected one");
			
			assertEquals(5, venus.getCoefficientMatrix().length, "the rows number is not the expected one");
			assertEquals(10, venus.getCoefficientMatrix()[0].length, "the columns number is not the expected one");
			
			
			//Case 2
			venus.setLast(100, 25);
			venus.setCoefficient(25,200);
			
			assertNotNull(venus.getLastMatrix(), "The matrix is null as not expected");
			assertNotNull(venus.getCoefficientMatrix(), "The matrix is null as not expected");
			
			assertEquals(100, venus.getLastMatrix().length, "the rows number is not the expected one");
			assertEquals(25, venus.getLastMatrix()[0].length, "the columns number is not the expected one");
			
			assertEquals(25, venus.getCoefficientMatrix().length, "the rows number is not the expected one");
			assertEquals(200, venus.getCoefficientMatrix()[0].length, "the columns number is not the expected one");
		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------
}
