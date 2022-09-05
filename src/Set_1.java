import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Set_1 {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
	}

}
