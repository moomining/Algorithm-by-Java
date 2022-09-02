import java.util.LinkedList;

public class List_01 {
	
	public int[] solution(int[] arr) {
		
		int max = 0;
		
		for(int a : arr) {
			if(a > max) 
				max = a;
		}
		
		int gaesu = 0;
		
		for(int a : arr) {
			if(a == max)
				gaesu++;
		}
		
		int[] index = new int[gaesu];
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(max == arr[i]) 
				index[cnt++] = i;
		}
		
		return index;
		
	}

}
