
import java.util.Calendar;
import java.util.Scanner;

@SuppressWarnings({ "unused", "resource" })
public class TimeTableApp {
	
	public static void main(String[] args) {
		
		TimeTable table = new TimeTable();
		Scanner scan = new Scanner(System.in);
		String[] weeks = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		Calendar cal = Calendar.getInstance();
		String day;
		int period;
		String name;
		String tutor;
		String room;
		String date;
		int num;
		
		while(true) {

			System.out.println("===============Main Menu===============");
			System.out.println("(1) Add a class to my time table");
			System.out.println("(2) View the class at a specific period");
			System.out.println("(3) Print the entire time table");
			System.out.println("(4) TimeTable corresponding to input date");
			System.out.println("(5) Exit  the program");
			System.out.println("===============Main Menu===============");
			
			 num  = scan.nextInt();
		
	    if(num >5)
		 {
			 System.out.println("1번부터 5번 사이의 값을 입력하세요.");
		 }
		else 
		{
				 	 
		   switch(num)
				 {
			case 1: 
			{
	
			System.out.println("Please enter the day  to add the class");
			day = scan.next();
			System.out.println("Please enter the period  to add the class");
			period = scan.nextInt();
			
			if(period == 3 || period ==7)
			{
				System.out.println("false");
				break;
			}
			System.out.println("Please enter the name  to add the class");
			name = scan.next();
			System.out.println("Please enter the name  to add the tutor");
			tutor = scan.next();
			System.out.println("Please enter the name  to add the room");
			room = scan.next();
			System.out.println("");
			table.setScheduleInformation(day, period, name, tutor, room);
			table.tostring();
			break;
			}
			
			case 2:
			{
				System.out.println("Please enter the day  to add the class");
				day = scan.next();
				System.out.println("Please enter the period  to add the class");
				period = scan.nextInt();
				
				table.getScheduleInformation(day, period);
				break;
			}
			case 3:
			{
				table.tostring();
				break;
			}
			case 4:
			{
				System.out.println("Enter the date");
				
				date = scan.next();
				
				cal = table.setInputDate(date);
				
				if (cal.get(Calendar.DAY_OF_WEEK) - 1 == 0 || cal.get(Calendar.DAY_OF_WEEK) - 1 == 6) {
					System.out.println("There are no schedule");
					break;
				} else {
					table.oneDaySchedule(weeks[cal.get(Calendar.DAY_OF_WEEK) - 1]);
				}

				table.setInputDate(date);
				break;
			}
			
			case 5:
			{
				System.out.println("program Exit");
				break;
			}
		  }
		
		if(num ==5)
		break;
	    
			 }
		}
	}
}
