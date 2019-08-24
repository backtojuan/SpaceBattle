import java.util.List;

public class Planet {
	private List<Spaceship> spaceships;
	public Planet() {
		spaceships = new ArrayList<>();
	}
	public List<Spaceship> getSpaceships() {
		return spaceships;
	}
	public boolean isPrime(int n) {
		boolean prime = true;
		double number = Math.sqrt(n); 
		int noDecimal = (int) Math.round(number);
		if(number == noDecimal) {
			prime = false;
			System.out.println("no es primo");
			return prime;
		}
		else {
			if(n%2 != 0 && n%3 != 0 && n%5 != 0 && n%7 != 0 && n%11 != 0 && n%13 != 0) {
				prime = false;
				System.out.println("es primo");
				return prime;
			}else {
				System.out.println("no es primo");
				return prime;
			}
		}
		
	}
}