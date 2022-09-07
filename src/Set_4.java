import java.util.HashSet;

public class Set_4 {
	
	public boolean solution(String[] words) {
		HashSet<String> set1 = new HashSet<>();
		
		for(String w : words) {
			set1.add(w);
		}
		
		boolean answer = true;
		//1. 썼던 단어 다시 사용 No
		if(words.length != set1.size()) {
			answer = false;
		}
		
		//2. 첫 글자 앞 단어 마지막 글자
		for(int i = 0; i < words.length -1; i++) {
			if(words[i].charAt(words[i].length() -1) != words[i+1].charAt(0)) {
				answer = false;
			}
		}
        
        return answer;
    }

}
