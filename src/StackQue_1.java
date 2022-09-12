import java.util.Stack;

public class StackQue_1 {
	
	boolean solution(String s) {
        boolean answer = true;
        
        Stack st = new Stack();
        
        for(int i = 0; i < s.length(); i++) {
        	st.add(s.charAt(i));
        }
        
        for(int i = 0; i < s.length(); i++) {
        	if(st.toString().charAt(i) == '(') st.remove(i);
        	else if(st.toString().charAt(i) == ')') st.remove(i);
        }
        
        if(st.isEmpty()) answer = true;
        else answer = false;
        
        return answer;
    }

}
