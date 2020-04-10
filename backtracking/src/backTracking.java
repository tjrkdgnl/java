import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortPractice2 {

	public static void main(String[] args) {


		int[] arr = {0,0,0,10000};
		
		System.out.println(solution(arr));
	}


	public static String solution(int[] numbers) {
		String answer = "";

		boolean[] index = new boolean[numbers.length];
		int[] result = new int[numbers.length];

		ArrayList<String> list = new ArrayList<>();
		
		ArrayList<String> answers = new ArrayList<String>();
		
		
		answers = backTracking(0,index,numbers,result,list);
		
		Collections.sort(answers, Comparator.reverseOrder());
		
	
		return answers.get(0);
	}

	public static ArrayList<String> backTracking(int n,boolean[] index, int[] list,int [] result,ArrayList<String> arr) {
		if(n == result.length) {
			String str = result[0] +"";
			for(int i = 1 ; i < result.length ; i++) {
				str += result[i];
			}

			arr.add(str);
		}
		else{
			for(int i = 0 ; i < list.length ; i++) {
				if(!index[i]) {
					index[i] = true;
					result[n] = list[i];
					backTracking(n+1, index, list, result, arr);
					index[i] = false;
				}
			}
		}
		return arr;
	}
}
