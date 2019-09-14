package selftest;

public class self2 {

	public static void main(String[] args) {
		String name = new String("seo gang hui");
		String greeting1 ="Hello ";
		String greeting2 =" nice to meet you";
		String uName = new String("SEO GANG HUI");
		
		System.out.println(greeting1 + name + greeting2 );
		System.out.println(name.length());
		System.out.println(name.equals(uName));
		System.out.println(name.equalsIgnoreCase(uName));
		
	}

}
