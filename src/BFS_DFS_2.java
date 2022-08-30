import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;


public class BFS_DFS_2 {
	
	
	static class Node {
		String name;
		List<Node> links;
		boolean visited;
		
		
		public Node(String name) {
			this.name = name;
			this.links = new LinkedList<>();
		}

		@Override
		public String toString() {
			return "Node [name=" + name + "]";
		}
		
		void link(Node node) {
			links.add(node);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			
			return Objects.equals(name, other.name);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name);
		}
		void visit() {
			this.visited = true;
		}
		
		
		boolean isVisited() {
			return this.visited;
		}
		
	}
	
	public static void main(String[] args) {
		//graph
		//Node, Edge
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		
		a.link(b);
		a.link(d);
		b.link(a);
		b.link(c);
		b.link(e);
		c.link(b);
		c.link(d);
		d.link(a);
		d.link(c);
		d.link(e);
		e.link(b);
		e.link(d);
		
		Node target = e;
		
		//BFS
		Queue<Node> queue = new LinkedList<>();
		queue.offer(a);
		
		while(queue.isEmpty()) {
			Node n = queue.poll();
			n.visit();
			System.out.println(n);
			
			if(n.equals(target)) {
				System.out.println("FOUND!! " +n);
				break;
			}
			
			for(Node l : n.links) {
				if(l.isVisited()) continue;
				if(queue.contains(l)) continue;
				queue.offer(l);
			}
			
//			n.links.stream()
//					.filter(l -> !queue.contains(l))
//					forEach(queue::offer);
		}
	}

}
