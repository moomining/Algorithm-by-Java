
public class Exercise_03 {
	
	 public int[] solution(long n) {
	        int[] answer = {};
	        
	        int max = (int)n;
	        
	        for(int i = 0; i < n; i ++) {
	        	answer[i] = max--;
	        }
	        
	        return answer;
	    }

}
