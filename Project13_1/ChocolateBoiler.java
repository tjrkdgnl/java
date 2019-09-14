package selfTest;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private volatile static ChocolateBoiler cho ;
	
	public static ChocolateBoiler getinstance() {
		
		if(cho ==null) {
			synchronized(ChocolateBoiler.class) {
				if(cho == null)
					cho=  new ChocolateBoiler();
			}
		}
		return cho;
		
	}
   
    
	public ChocolateBoiler() {
		if(isEmpty())
		{
		empty = true;
		boiled = false;
		}
	}
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Filling with mixture");
		}
		else
			System.out.println("Already filled");
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
	
			empty = true;
			System.out.println("Draining the mixture");
	
		}
		else
			System.out.println("Already drained");
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
	
			boiled = true;
			System.out.println("Boiling the mixture");
		}
		else
			System.out.println("Already boiled");
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
