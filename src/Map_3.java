import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// ConcurrentHashMap : synch + high concurrency

class MyData {
	int v;
	
	public MyData(int v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "MyData [v=" + v + "]";
	}

	//추가추가! ★
	//Key로 사용하는 것은 hashCode로 호출해 bucket의 index로 사용함.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + v;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyData other = (MyData) obj;
		if (v != other.v)
			return false;
		return true;
	}
	
	
	
}
public class Map_3 {
	public static void main(String[] args) {
		Map<MyData, Integer> map = new ConcurrentHashMap<>();
		map.put(new MyData(1), 1);
		map.put(new MyData(2), 2);
		map.remove(new MyData(3), 3);
		method1(map);
		
	}

	static void method1(Map<MyData, Integer> map) {
		System.out.println(map);
		//동작하게 하려면 hashCode 값을 넣어줘야 함 
		System.out.println(map.get(new MyData(1)));
		System.out.println(map.get(new MyData(2)));
		System.out.println(map.getOrDefault("C",3));
		System.out.println(map.values());
		System.out.println(map.keySet());
	}
}
