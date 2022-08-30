import java.util.HashMap;
import java.util.Map;

// ConcurrentHashMap : synch + high concurrency
public class Map_2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.putIfAbsent("A", 10);
		map.putIfAbsent("C", 10);
		map.replace("A", 10);
		map.replace("A", 11, 12);
		map.remove("B", 3);
		method1(map);
		
	}

	static void method1(Map<String, Integer> map) {
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.get("C"));
		System.out.println(map.getOrDefault("C",3));
		System.out.println(map.values());
		System.out.println(map.keySet());
	}
}
