import java.util.HashSet;

public class Set_3 {
	public boolean solution(int[] lotto) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i : lotto) {
			set.add(i);
		}
		boolean answer = true;
		
		//1. 1-45 안에 있는지
		for(int i = 0; i < lotto.length; i++) {
			if((lotto[i]<1) || (lotto[i] >45)) {
				answer = false;
			}
		}
		
		//2. 중복 없는지
		if(set.size() != 6) {
			answer = false;
		}
        
        return answer;
    }
	
}
