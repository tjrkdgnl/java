package Assignment02;

import java.util.Random;

public class Region extends Thread{

	private String regionName;			// The name of the region
	private int regionNum;			// The number of the region
	private int population;			// The population of the region
	private Candidate[] candidates;	// An array of the candidates of the election
	private int VoteTocandidate;
	private int count =1;
	
	Random randomVoteTocandidate = new Random();

	public Region(String regionName,int regionNum,int population,Candidate[] candidates) {
		this.regionName = regionName;
		this.regionNum = regionNum;
		this.population = population;		
		this.candidates = candidates;
	
	}
	
	public String getRegionName() {
		return regionName;
	}

	
	public void generateVotes()  {	

			while(count <population)
			{							
				VoteTocandidate = randomVoteTocandidate.nextInt(candidates.length);
				
					try 
					{
						candidates[VoteTocandidate].callAddVotes(regionNum,candidates[VoteTocandidate].toRegionString(regionNum) + 1);	
						
					} 				
					catch (InterruptedException e)
					{					
						e.printStackTrace();
					}
					
					count++;
			}			
	}	
	
	public void run() {
		generateVotes();
	}
}
