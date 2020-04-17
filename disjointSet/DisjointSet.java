
public class DisjointSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		System.out.println(solution(3, arr));
	}


	public static int solution(int n, int[][] computers) {
		int answer = 0;
		int[] parent = new int[n+1];
		int[] rank = new int[n+1];
		int[] idx=  new int[2];
		boolean[] check = new boolean[parent.length];
		
		for(int i =1 ; i <= n ; i++)
			rank[i] = 0;
		
		int index ;
		
		for(int i = 0 ; i < computers.length ; i++)
		{
			for(int j = 0 ; j<computers[i].length ; j++)
				if(parent[j+1] ==0 && computers[i][j] !=0)
					parent[j+1] = j+1;
		}
		
		for(int i = 0 ; i < computers.length ; i++) {
			index =0;
					
			for(int j = 0; j<= computers[i].length; j++) {
				if(index ==2) {
					union_set(parent,rank,idx[0],idx[1]);
					idx[0] = idx[1];
					idx[1] = 0;
					index -=1;
				}
				
				if(j != computers[i].length && computers[i][j] !=0) {
					idx[index++] = j+1;
				}
			}
		}
		
		for(int i =1 ; i < parent.length ; i++)
			System.out.print(parent[i] +" ");
		System.out.println();
		
		for(int i =1 ; i < parent.length ; i++)
			if(parent[i] !=0)
				check[parent[i]] = true;
		
		
		for(int i = 1 ; i < check.length ; i++)	
			if(check[i])
				answer++;
		
		return answer;
	}

	
	public static int find(int[] parent,int x) {	 
		if(parent[x] ==x) {
			return parent[x];
		}
		else {
			return parent[x] = find(parent,parent[x]);
		}
	}

	public static void union_set(int[]parent,int[] rank, int x, int y) {
		int a = find(parent,x);
		int b = find(parent,y);
		
		if(a == b)
			return;

		if(rank[a] > rank[b]) {
			parent[b] = a;
	
		}
		else {
			parent[a] = b;
			
			if(rank[a] == rank[b])
				rank[b]++;
		}
	}
}
