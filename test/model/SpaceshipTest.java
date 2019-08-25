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
	public class SpaceshipTest {
		
		private Spaceship ss;
		
		//Scenaries
		public void setUpScenary1() {
			
		}
		public void setUpScenary2() {
			ss = new Spaceship(12,5,17);
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
		@Test
	    public void testSpaceShip() {
			
			setUpScenary1();
			Spaceship ss = new Spaceship(0, 4, 7);
			
			assertNotNull(ss,"The spaceship is null as not expected");
			
			assertEquals(0, ss.getX(), "The horizontal position is not the expected one");
			assertEquals(4, ss.getY(), "The vertical position is not the expected one");
			assertEquals(7, ss.getNumber(), "The value is not the expected one");
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testSet() {
			
			setUpScenary2();
			
			//Case 1
			ss.setX(5);
			ss.setY(13);
			ss.setNumber(2);
			
			assertEquals(5, ss.getX(), "The horizontal position is not the expected one");
			assertEquals(13, ss.getY(), "The vertical position is not the expected one");
			assertEquals(2, ss.getNumber(), "The value is not the expected one");	
			
			//Case 2
			ss.setX(100);
			ss.setY(75);
			ss.setNumber(521);
			
			assertEquals(100, ss.getX(), "The horizontal position is not the expected one");
			assertEquals(75, ss.getY(), "The vertical position is not the expected one");
			assertEquals(521, ss.getNumber(), "The value is not the expected one");	
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
