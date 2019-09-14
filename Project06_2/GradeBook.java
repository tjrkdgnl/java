package selfTest;

import java.util.Scanner;
@SuppressWarnings("resource")
		
public class GradeBook {
	private int numberOfStudents;
	private int numberOfQuizzes;
	private int i,j ;
	private int[][] grade;
	
	private double[] studentAverage;
	private double[] quizAverage;
	
	Scanner keyboard = new Scanner(System.in);
	
public GradeBook()
	{
	
		System.out.println("Enter the number of Students:");
		numberOfStudents = keyboard.nextInt();
		
		System.out.println("Enter the number of Quizzes:");
		numberOfQuizzes = keyboard.nextInt();
		
		grade = new int[numberOfQuizzes][numberOfStudents];
		
		studentAverage = new double[numberOfStudents];
		quizAverage = new double[numberOfQuizzes];
		
		/* Initialize grade */
		
		for(j = 0 ; j<numberOfStudents ; j++) {
			for(i = 0 ; i<numberOfQuizzes ; i++) {
				System.out.printf("Enter the score for student %d on quiz %d\n",j+1,i+1);
				grade[i][j] = keyboard.nextInt();
			}
		}

		fillStudentAverage(studentAverage,numberOfStudents,numberOfQuizzes);
		fillQuizAverage(quizAverage,numberOfStudents,numberOfQuizzes);
	}
	
	private void fillStudentAverage(double[] studentAverage ,int numberOfStudents , int numberOfQuizzes)
	{
		
		for(j = 0 ;j <numberOfStudents ; j++) {
			for(i = 0 ; i <numberOfQuizzes ; i++) {
				studentAverage[j] += grade[i][j];
				
			}
			studentAverage[j] /=numberOfQuizzes ;	
		}
	}
	
	private void fillQuizAverage(double[] quizAverage ,int numberOfStudents , int numberOfQuizzes)
	{
		
		for(i = 0 ;i < numberOfQuizzes ; i++) {
			for(j = 0 ; j <numberOfStudents ; j++) {
				quizAverage[i] += grade[i][j];
				
			}
			quizAverage[i] /=numberOfStudents ;	
		}
	}
	
	
	public void display()
	{
		
		for(i  =0 ; i<numberOfStudents ;i++ ) {
			System.out.printf("student %d Quizzes: ", i+1 );
			for(j = 0 ; j<numberOfQuizzes   ; j ++) {
				System.out.printf("%d ",grade[j][i]);
			}
			System.out.printf(" Ave = %f\n",studentAverage[i]);
		}
		System.out.println("Quiz average:");
		
		for(i =0 ; i <numberOfQuizzes  ; ) {
			System.out.printf("Quiz %d Ave: %f ",i+1,quizAverage[i]);
			i++;
		}
	}
	
	
}