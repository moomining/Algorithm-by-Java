import java.util.LinkedList;
import java.util.List;
import java.util.stream.*;

public class Exercise_01_2 {
	public int[] solution(int[] arr) {
		//최대값 구하기
		int max = 0;
		for(int a : arr) if(a > max) max = a;
		//List making
		List<Integer> list = new LinkedList<>();
		//배열에 인덱스 채우기
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] == max) list.add(i);
		}
		//=위에꺼랑 똑같은 거 
		//IntStream.range(0, arr.length)
		//.filter(i -> arr[i] == max)
		//.toArray();
		
		//change List into Array
//		int[] answer = new int[list.size()];
//		for(int i = 0; i < list.size(); i++) {
//			answer[i] = list.get(i);
//		}
		
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		
        return answer;
    }

}
