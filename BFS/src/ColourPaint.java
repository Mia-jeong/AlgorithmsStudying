import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class ColourPaint {

	static Vector<Integer>[] graph;
	static int flags[];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new Vector[n];
		flags = new int[n];
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(graph[a]==null) graph[a] = new Vector<Integer>();
			
			if(graph[b]==null) graph[b] = new Vector<Integer>();
			
			graph[a].addElement(b);
			graph[b].addElement(a);
		}
		
		String result = bfs(0);
		System.out.println(result);
	}
	
	public static String bfs(int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(n);
		flags[n] = 1;
		
		while(! queue.isEmpty() ) {
			int head = queue.poll();
			int colour = flags[head] == 1? 2: 1;
			Vector<Integer> adjacent = graph[head];
			
			for (int i = 0; i < adjacent.size(); i++) {
				
				int temp = adjacent.get(i);
				if(flags[temp] == 0){
					queue.add(temp);
					flags[temp] = colour;
				}
				
				if(flags[temp] == flags[head]) {
					return "NO";
				}

			}
		}
		
		return "YES";
	} 

}
