//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.jupiter.api.Assertions.*;	
	import org.junit.jupiter.api.Test;
//-----------------------------------------------------------------------------------------------------------------------------------------	
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
		
			venus.setLast(8, 5);
			venus.setCoefficient(5,10);
			
			assertNotNull(venus.getLastMatrix(), "The matrix is null as not expected");
			assertNotNull(venus.getCoefficientMatrix(), "The matrix is null as not expected");
			
			assertEquals(8, venus.getLastMatrix().length, "the rows number is not the expected one");
			assertEquals(5, venus.getLastMatrix()[0].length, "the columns number is not the expected one");
			
			assertEquals(5, venus.getCoefficientMatrix().length, "the rows number is not the expected one");
			assertEquals(10, venus.getCoefficientMatrix()[0].length, "the columns number is not the expected one");
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
