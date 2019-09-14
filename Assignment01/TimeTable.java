
import java.util.Calendar;
import java.util.Scanner;

public class TimeTable {
		
	Scanner scan = new Scanner(System.in);
	
	enum DAYS {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY};
	
	private Subject[][] timeTable = new Subject[10][5];
	
	
	public TimeTable() {
		
		initialize();
	}
	
	private void initialize() 
	{	
		for(int i = 0 ; i <10 ; i ++)	{
			for(int j =0 ; j <5 ; j++) {
				timeTable[i][j] = new Subject("----");
				
				if( i ==2 || i ==6) {
				
					if(i ==2) {
						timeTable[i][j] = new Subject("BREAK");
					}
					else{
						timeTable[i][j] = new Subject("LUNCH");
					}
				}
			}
		}
	}
	
	public void tostring() 
	{
		
		System.out.printf("%14s %12s %11s %12s %10s\n",DAYS.MONDAY ,DAYS.TUESDAY,DAYS.WEDNESDAY,DAYS.WEDNESDAY , DAYS.THURSDAY ,DAYS.FRIDAY);
		
		
		for(int i =0 ; i<10 ; i++) {
			if(i !=9)
				System.out.print(" "+ (i+1));
			else
				System.out.print((i+1));
					
		
			for(int j = 0 ; j<5;j++) {
				System.out.printf("%s",String.format("%12s", timeTable[i][j]));
			
			}
			
				System.out.println("");
		}
	}
	
	public void getScheduleInformation(String day,int period) 
	{
		System.out.println("At that time you have :");
		timeTable[period-1][DAYS.valueOf(day).ordinal()].GetDetails();
	}
	
	public boolean setScheduleInformation(String day,int period,String name,String tutor,String room) {
		
		
		if(timeTable[period-1][DAYS.valueOf(day).ordinal()].GetName().equals("----"))
		{
			System.out.println("Class successfully added");
			timeTable[period-1][DAYS.valueOf(day).ordinal()].className = name;
			timeTable[period-1][DAYS.valueOf(day).ordinal()].SetProfessor(tutor);
			timeTable[period-1][DAYS.valueOf(day).ordinal()].SetRoom(room);
	
			return true;
		}
		else
			
			return false;
		
	}
	
	public void oneDaySchedule(String day) {
		
		System.out.println(DAYS.valueOf(day));
		for(int i =0 ; i<10;i++)
		{
			System.out.println(timeTable[i][DAYS.valueOf(day).ordinal()].GetName());
		}
	}
	
	
	@SuppressWarnings({ "unused", "null" })
	public Calendar setInputDate(String date) 
	{
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, Integer.parseInt(date.substring(0,4)));
		cal.set(Calendar.MONTH,Integer.parseInt(date.substring(4,6))-1 );
		cal.set(Calendar.DATE, Integer.parseInt(date.substring(6,8)));
		
		
		return cal;
	}
}
