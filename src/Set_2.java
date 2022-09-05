import java.util.HashSet;

/*class MyData {
	int v;
	
	public MyData(int v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "MyData [v=" + v + "]";
	}
	
	
}*/

public class Set_2 {
	public static void main(String[] args) {
		
		HashSet<Integer> setA = new HashSet<>(); //set은 순서를 보장하지 않음 
		setA.add(1);
		setA.add(2);
		setA.add(3);
		
		HashSet<Integer> setB = new HashSet<>();
		setB.add(2);
		setB.add(3);
		setB.add(4);
		
		//합집합
		setA.addAll(setB);
		
		System.out.println(setA);
		
		//차집합
		setA.removeAll(setB);
		
		System.out.println(setA);
		
		
		setA.add(2);
		setA.add(3);
		//교집합
		setA.retainAll(setB);
		
		System.out.println(setA);
		
		//HashSet 중복된 것 찾아내는 것도 할 수 있음? 
		
	}
}
