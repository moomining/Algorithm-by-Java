
public class Map_ex_1 {
	public int solution(int[] nums) {
		//총 N마리 존재 
		//N/2 마리 선택, N개 중에 겹치지 않는 수가 몇 개 있나 
		int answer = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != nums[i+1]) {
				answer++;
			} 
		}
        System.out.println(answer);
        
        
        return answer;
    }
}
