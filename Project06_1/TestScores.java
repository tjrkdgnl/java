package selfTest;

import java.util.Scanner;

@SuppressWarnings("resource")
public class TestScores {
	public static final int MAX_NUMBER_SCORES = 10;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] scores = new double[MAX_NUMBER_SCORES];
		
		
		int counting = 0;
		System.out.println("This program reads test scores and shows");
		System.out.println("how much each differs from the average.");
		System.out.println("Enter test scores:");
		
		counting = fillArray(scores);
		showDifference(scores,counting);
		
	}

	
	public static int fillArray(double[] scores)
	{	System.out.println("Mark the end of the list with a negative number.");	
	
		Scanner scan = new Scanner(System.in);
		
		int i;
		
		for(i =0 ; i < scores.length ; i++)
		{
			
			scores[i] = scan.nextDouble();
			
			if(scores[i] < 0)
			{
				
				break;
			}
			
		}
		
		return i;
	}
	
	
	public static void showDifference(double[] scores, int count)
	{
		
		double average = computeAverage( scores, count);
		
		int idx =0;
		System.out.printf("Average of %d the scores = %f \n",count,average);
		System.out.println("The scores are: ");
		
		for(idx = 0 ; idx < count ;idx++)
		{
			System.out.printf("%f differs form average by %f\n" ,scores[idx],scores[idx] - average );
		}
		/* your code */
	}

	public static double computeAverage(double[] scores,int count)
	{	
		int i =0;
		double sum =0;
		for( i =0 ; i< count;i++) {
			sum += scores[i];
		}
		
		sum /=count;
		
		return sum;
	}
	
}
