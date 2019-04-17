import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class BasicTraversal {

	static Vector<Integer>[] graph; 
	static boolean flags[]; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nodeCount = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new Vector[nodeCount];
		flags = new boolean[nodeCount];
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(graph[a]==null) graph[a] = new Vector<Integer>();
			
			if(graph[b]==null) graph[b] = new Vector<Integer>();
			
			graph[a].addElement(b);
			graph[b].addElement(a);
		}
		
		String dfs = dfs(0);
		flags = new boolean[nodeCount];
		String bfs = bfs(0);
		System.out.println(dfs);
		System.out.println(bfs);
		
		
	}
	
	public static String dfs(int n) {
		
		flags[n] = true;
		String result = n+" ";
		
		Vector<Integer> adjacent = graph[n];
		Collections.sort(adjacent);
		for (int i = 0; i < graph[n].size(); i++) {
			
			int nextNode = graph[n].get(i);
			
			if(!flags[nextNode]) {
				result += dfs(nextNode);
			}
			
		}
		return result;
	}
	
	public static String bfs(int n) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		queue.add(n);
		flags[n] = true;
		
		while(!queue.isEmpty()) {
			
			int front = queue.poll();
			Vector<Integer> adjacent = graph[front];
			Collections.sort(adjacent);
			sb.append(front+" ");
			for (int i = 0; i < adjacent.size(); i++) {
				int a = adjacent.get(i);
				if(!flags[a]) {
					queue.add(a);
					flags[a] = true;
				}
			}
		
		}
		
		return sb.toString();
	}

}
