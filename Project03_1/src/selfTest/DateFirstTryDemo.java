package selfTest;

public class DateFirstTryDemo {

	public static void main(String[] args) {

		DateFirstTry date1 = new DateFirstTry("March",29);
		DateFirstTry date2 = new DateFirstTry("August",18);
		
		date2.makeItNewYears();
		
		System.out.println("date1: " + date1.yellIfNewYear());
		System.out.println("date2: " + date2.yellIfNewYear());
		
	}

}
