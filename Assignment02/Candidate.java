package Assignment02;

public class Candidate implements Comparable {
	
	private int loc =0;
	private String name;
	private int numVotes = 0;
	private Vote[] votes;
	private int idx = 0;
	
	public Candidate(String name,int MaxVotes) {
		this.name = name;	
		votes = new Vote[MaxVotes];
		
		for(int i =0 ; i<MaxVotes ;i++)
			votes[i] = new Vote();	
	}
	
	public Candidate(String name)
	{
		this.name = name;
	}
	
	public int getAllVote() {
		return this.numVotes;
	}
	
	public String toString() {
		return "----------------Candidate----------------" + "\n"+ "name: " +this.name + "\n" +"Total Votes: " + this.numVotes;
	}
	
	public String getCandidatesName()
	{
		return this.name;
	}
	
	public void setNumVotes(int NumVotes) {
		 this.numVotes = NumVotes;
	}
	
	public int toRegionString(int regionNum) {
		return votes[regionNum].numVote;
	}
	
	public void callAddVotes(int regionNum, int numVote) throws InterruptedException {
		votes[regionNum].addVote(regionNum,numVote);	
	}
	
	@Override
	public int compareTo(Object obj) {
		int compareNumVotes = ((Candidate)obj).numVotes;
		return this.numVotes - compareNumVotes;
	}
	
	private class Vote {
		int RegionNum ;
		int numVote ;
		
		public Vote() {
			RegionNum =0;
			numVote =0;
		}
		
		public Vote(int RegionNum,int numVote)
		{
			this.RegionNum = RegionNum;
			this.numVote = numVote;
		}
		
		public synchronized  void addVote(int regionNum,int numVote) throws InterruptedException {
			if(loc >= votes.length) 
			{
				System.out.println("Array is full");
				wait();
			}
			
			Vote voteObject = new Vote(RegionNum,numVote);			
			votes[regionNum] = voteObject;	
			notifyAll();
		}	
	}
}
