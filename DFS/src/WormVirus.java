import java.util.Scanner;
import java.util.Stack;
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
		
		int result = dfs(1);
		System.out.println(result);
	}
	
	public static int dfs(int start) {
		
		int result = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(start);
		flags[start] = true;
		
		while(!stack.isEmpty()) {
			int top = stack.pop();
			
			Vector<Integer> temp = graph[top];
			
			for (int i = 0; i < temp.size(); i++) {
				int t = temp.get(i);
				if(! flags[t]) {
					stack.push(t);
					flags[t] = true;
					result++;
				}
			}
		}
		
		return result;
	}

}
