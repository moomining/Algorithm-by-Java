import java.util.LinkedHashSet;

public class Set_5 {
	
	public Integer[] solution(int[] arr) {
       
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i : arr) {
			set.add(i);
		}
		Integer[] answer = {};
		
		answer = set.toArray(new Integer[0]);
       

        return answer;
    }

}
