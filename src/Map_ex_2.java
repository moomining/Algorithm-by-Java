import java.util.*;


public class Map_ex_2 {
	public String solution(String[] participant, String[] completion) {
        
		List<String> players = new LinkedList<>();
		
		for(String p : participant) players.add(p);
		for(String c : completion) players.remove(c); // 이 부분이 시간이 오래 걸림 
		
        return players.get(0);
    }
}
