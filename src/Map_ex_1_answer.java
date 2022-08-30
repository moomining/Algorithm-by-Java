import java.util.HashMap;
import java.util.Map;

public class Map_ex_1_answer {
	public int solution(int[] nums) {
		//포켓몬 종류의 개수를 구함.
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int n : nums) {
			map.put(n, 0);
		}
		//중복된 건 제외하고 넣어짐 
		//아... 중복된 건 위에 덮어짐 
		int n1 = map.keySet().size();
		//배열 크기의 1/2을 구한다.
		int n2 = nums.length/2;
		
		//최소값 선택 
        return Math.min(n1, n2);
    }
}
