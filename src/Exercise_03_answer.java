import java.util.LinkedList;
import java.util.List;

public class Exercise_03_answer {
	
	 public int[] solution(long n) {
	        List<Integer> list = new LinkedList<>();
	        
	        while(n > 0) {
		        list.add((int)n % 10);
		        n /= 10;
	        }
	        
	        return list.stream().mapToInt(Integer::intValue).toArray();
	    }

}
