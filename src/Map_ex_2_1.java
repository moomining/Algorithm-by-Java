import java.util.HashMap;
import java.util.Map;

public class Map_ex_2_1 {
	
	public static void main(String[] args) {
		String[] p = {"leo", "kiki", "eden"};
		String[] c = {"eden", "kiki"}; 
		
		System.out.println(solution(p,c));
	}
	
	public static String solution(String[] participant, String[] completion) {
        
		Map<String, Integer> players = new HashMap<>();
		
		//O(n)
		for(String p : participant) {
			players.put(p, players.getOrDefault(p, 0) + 1);
		}
		
		for(String c : completion) {
			int n = players.get(c) - 1;
			System.out.println(n);
			if(n == 0) players.remove(c);
			else players.put(c, n);
		}
		
		//keySet = Set<>형이 리턴됨 
        return players.keySet().iterator().next();
    }
	
}
