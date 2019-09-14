package selfTest;

public class ChocolateFactory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChocolateBoiler a = ChocolateBoiler.getinstance();
		ChocolateBoiler b = ChocolateBoiler.getinstance();
		
		
		a.fill();
		b.fill();
		a.boil();
		b.boil();
		a.drain();
		b.drain();
		
	}
}
