package Assignment02;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ElectionSim {

	private String outputFile;
	private int population;
	private Candidate[] candidates;
	private Region[] regions;

	private String str;
	private String[] strarr;
	int idx =0;
	int subidx =0;
	Scanner scan;
	int num =0;
	int result =0;
	
	public ElectionSim(String inputFile, String outputFile) {
		this.outputFile = outputFile;
		
		this.population = 0;
	
		try 
		{
			 scan = new Scanner(new FileInputStream(inputFile));
			 
			 while(scan.hasNextLine())
			 {
				 str = scan.nextLine();
				 
				 strarr = str.split(" ");
				 
				 if(strarr[0].equals("POPULATION"))
				 {
					 this.population = Integer.parseInt(strarr[1]);
				
				 }
				 
				 else if (strarr[0].equals("CANDIDATES"))
				 {
					 num = Integer.parseInt(strarr[1]);
					 candidates = new Candidate[num];
								
				 }
				 else if(strarr[0].equals("REGIONS"))
				 {
					 num = Integer.parseInt(strarr[1]);
					 regions = new Region[num];
			
				 }
				
				 else if(strarr.length == 1)
				 {
					candidates[idx++] = new Candidate(strarr[0],this.population);
				
				 }
				 
				 else if(strarr.length == 3)
				 {
					 regions[subidx++] = new Region(strarr[0],Integer.parseInt(strarr[1]),Integer.parseInt(strarr[2]),candidates);
				 }				 
			 }
		 
		}	
		catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
		}	
	}
	
	public void saveData() {
	
		
		
		for(int j = 0 ; j< candidates.length ; j++)
		{
			for(int i = 1 ; i <=regions.length; i++)
			{
				num += candidates[j].toRegionString(i);
		
			}
			candidates[j].setNumVotes(num);			
			num = 0;

		}	
		for(int k = 0 ; k< candidates.length ; k++)
		{
			num += candidates[k].getAllVote();
		}
		System.out.println(num);
		
		Arrays.sort(candidates);
		
		idx = 0;
		try {
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(this.outputFile));
			
			while(idx != candidates.length)
			{
				outputStream.println(candidates[idx].toString());
				outputStream.println("Seoul: " + candidates[idx].toRegionString(1));
				outputStream.println("Daegu: " + candidates[idx].toRegionString(2));
				outputStream.println("Daejeon: " + candidates[idx].toRegionString(3));
				outputStream.println("Gwangju: " + candidates[idx].toRegionString(4));
				outputStream.println("Busan: " + candidates[idx].toRegionString(5));
				outputStream.println("=========================");
		
				idx++;
			}
			
			outputStream.close();
			
		}
		catch (FileNotFoundException e) {
			
			System.out.println("file open error");
		}		
	}
	
	public void runSimulation() {
		
		for(int i = 0 ; i <regions.length ; i++)
		{	
			try {
				regions[i].start();	
				regions[i].join();
			} 
			catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		saveData();
	}

	
}
