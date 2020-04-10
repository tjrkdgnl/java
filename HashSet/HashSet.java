import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SortPractice3 {
	static int answer = 0;
	public static void main(String[] args) {
		String str ="011";

		System.out.println("Á¤´ä: " +solution(str));
	}

	public static int solution(String numbers) {
	
		String[] strarr = numbers.split("");
		
		int[] arr = new int[strarr.length];
		boolean[] check = new boolean[arr.length];
		int[] success = new int[arr.length];
		HashSet<Integer>  result =new HashSet<Integer>();
		
		for(int i = 0 ; i < strarr.length ; i++)
			arr[i] = Integer.parseInt(strarr[i]);

		backtracking(0,arr, check, result ,success);
		
		
		return result.size();
	}

	public static void backtracking(int depth,int[] arr, boolean[] check,HashSet<Integer> result,int[] success) {
		if(depth == arr.length+1)
			return;
		
		String str= success[0] +"";
		
		if(depth>1)
			for(int i =1 ; i <depth; i++) 
				str+= success[i];
		
		int num = Integer.parseInt(str);
		
		for(int j = 2 ; j <=num ; j++) {
			if(num == j) {
				result.add(num);
				break;
			}
			else if (num % j ==0)
				break;
		}

		for(int i = 0 ; i < arr.length; i++ ) {
			if(check[i] ==false) {	
				check[i]= true;
				success[depth] =arr[i];
				backtracking(depth+1,arr, check,result,success);
				check[i] =false;
			}
		}
	}
}
