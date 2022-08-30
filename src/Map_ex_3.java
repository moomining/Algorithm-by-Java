import java.util.HashMap;
import java.util.Map;

public class Map_ex_3 {
	
	public int solution(String[][] clothes) {
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) {
			String type = clothes[i][1];
			map.put(type, map.getOrDefault(type, 0)+1);
		}
		
		int answer = 1;
				
		for(Integer value : map.values()) {
			answer *= value + 1;
		}
		return answer -1;
	}
	
	public static void main(String[] args) {
		
	}

}
