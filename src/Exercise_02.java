
public class Exercise_02 {
	
	public boolean solution(int[] arr) {
		//n : 1~n
		for(int i = 1; i < arr.length; i++) {
			int found = 0;
			
			for(int a : arr) {
				if(a == i) {
					found++;
				}
				
			}
			
			if(found != 1) return false; 
		}
		return true;
	}

}
