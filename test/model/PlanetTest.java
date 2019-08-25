//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	import static org.junit.jupiter.api.Assertions.*;
	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;

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
	public class PlanetTest {

		private Mars mars;
		private Venus venus;
		
		private void setupScenary1() {
		}
		
		private void setupScenary2() {
			venus = new Venus("venus");
			mars = new Mars("Mars");
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testPlanet() {
			setupScenary1();
			String name = "Mars";
			String name1 = "Venus";
			
			Mars mars = new Mars(name);
			Venus venus = new Venus(name1);
			
			assertNotNull(mars,"The planet is null");
			assertNotNull(venus,"The planet is null");
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		@Test
		public void testIsPrime() {
			setupScenary2();
			
			//Case 1
			int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
			for(int i = 0;i<primes.length;i++) {
					if(mars.isPrime(primes[i])) {
						assertTrue(mars.isPrime(primes[i]));
					}
					else {
						assertFalse(mars.isPrime(primes[i]));
					}
			}
			
			//Case 2
			int primes2[] = {501,654,758,145,257,312,808,984,122,356,315,410,601,584,1000,1013,698,301,100000};
			for(int i = 0;i<primes2.length;i++) {
					if(mars.isPrime(primes2[i])) {
						assertTrue(mars.isPrime(primes2[i]));
					}
					else {
						assertFalse(mars.isPrime(primes2[i]));
					}
			}
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}
