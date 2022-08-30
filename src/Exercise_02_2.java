import java.util.Arrays;

public class Exercise_02_2 {
	
	public boolean solution(int[] arr) {
		//n : 1~n
		int[] answer = new int[arr.length];
		
		for(int i = 0; i <arr.length; i++) answer[i] = i+1;
		// [1,2,3]
			
		Arrays.sort(arr);
				
		return Arrays.equals(answer, arr);		
	}

}
