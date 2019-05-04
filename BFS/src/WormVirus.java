import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class WormVirus {

	static Vector<Integer>[] graph; 
	static boolean flags[]; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new Vector[n+1];
		flags = new boolean[n+1];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new Vector<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			graph[a].addElement(b);
			graph[b].addElement(a);
		}
		
		int result = bfs(1);
		System.out.println(result);
	}
	
	public static int bfs(int n) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int result = 0;
		queue.add(n);
		flags[n] = true;
		
		while(! queue.isEmpty() ) {
			int head = queue.poll();
			
			Vector<Integer> adjacent = graph[head];
			
			for (int i = 0; i < adjacent.size(); i++) {
				int temp = adjacent.get(i);
				if(!flags[temp]) {
					result++;
					queue.add(temp);
					flags[temp] = true;
				}
			}
		}
		
		return result;
	}

}
