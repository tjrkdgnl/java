package selfTest;

public class DateFirstTry {

    public String month; // �̷��� �ؼ� �����ϸ� heap ������  string full?�̶� ������ ������ ����
	public int day;
	//String month = new String(); -> heap ������ �Ҵ�
	
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
