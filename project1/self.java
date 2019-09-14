package selftest;

public class self {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
			
		int count =3;
		int totalDistance =15;
		int quotient = totalDistance / count;
		int remainder = totalDistance % count;
		
		System.out.printf("Quotient of totalDistance / count: %d%n", quotient);
		System.out.printf("Remainder of totalDistance / count: %d%n",remainder);
		
		
	}

}
