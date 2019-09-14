package selfTest;



public class MathEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 60984;
		int b = 808;
		
		double x = 2.0;
		double y = 3.0;
		
		double r =Math.random() * 10;
		

		String a1 = new String();
		
		a1 =Integer.toString(54);
		System.out.println("Maximum: " + Math.max(a1,b));
		System.out.println("Mininum: " + Math.min(a1, b));
		System.out.println("x^y: " + Math.pow(x, y));
		System.out.println("y^x: " +  Math.pow(y,x));
		System.out.println("원의 면적: " + Math.pow(r, x) * Math.PI);
		
	}

}
