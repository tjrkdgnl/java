package selfTest;

import java.util.ArrayList;
import java.util.Collections;

public class GenericManager <T extends Comparable >
{
	private ArrayList<T> cList;

	public GenericManager() {
		
		cList = new ArrayList<T>();
	}
	
	public void add(T a) {
		
		cList.add(a);
		
	}
	
	public void sort() {
		Collections.sort(cList);
	}
	
	public String find(T a) {
		
		for(T str : cList)
		{
			if(str.equals(a))
				return str.toString();
		}
		return null;
	}
	
	public String toString() {

		String  a = null;
		for(T str : cList)
		{
			a = str.toString();
			
		}
		return a;
	}

}
