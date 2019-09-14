package selfTest;

public class DateFirstTry {

    public String month; // 이렇게 해서 생성하면 heap 영역에  string full?이란 별도의 공간에 저장
	public int day;
	//String month = new String(); -> heap 영역에 할당
	
	public DateFirstTry(String str,int date) {
		this.month =str;
		this.day = date;
	}
	
	/*Write the Code*/
	
	public void makeItNewYears() {
		month ="January";
		day = 1;
		/*Write the Code*/
	}
	
	public String yellIfNewYear() {
				
		if(month.equals("January") && day == 1)
		{
			month = "Happy new Year!";
		}
		else {
			month ="Not New Year's day";
		}
		
		return month;
		/*Write the Code*/
	}
	
}
