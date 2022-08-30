import java.util.Arrays;

public class Map_ex_2_2 {
	
	public static void main(String[] args) {
		String[] p = {"leo", "kiki", "eden"};
		String[] c = {"eden", "kiki"}; 
		
		System.out.println(solution(p,c));
	}
	
	public static String solution(String[] participant, String[] completion) {
        
		Arrays.sort(participant); //O(nlogn)
		Arrays.sort(completion);
		
		//O(n)
		for(int i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) return participant[i];
		}
		
		return participant[participant.length - 1];
    }
	
}
