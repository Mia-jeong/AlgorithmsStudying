import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class BinaryGraph {
	static Vector<Integer>[] graph; 
	static int flags[]; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nodeCount = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new Vector[nodeCount+1];
		flags = new int[nodeCount+1];
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(graph[a]==null) graph[a] = new Vector<Integer>();
			
			if(graph[b]==null) graph[b] = new Vector<Integer>();
			
			graph[a].addElement(b);
			graph[b].addElement(a);
		}
		
		String result = dfs(1);
		System.out.println(result);
	}
	
	public static String dfs(int n) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(n);
		flags[n] = 1;	//1로색칠
		
		while(!stack.isEmpty()) {
			
			int top = stack.pop();
			Vector<Integer> adjacent= graph[top];
			
			int number = flags[top];
			for (int i = 0; i < adjacent.size(); i++) {
				int temp = adjacent.get(i);
				if(flags[temp] == 0) {
					stack.push(temp);
					flags[temp] = number == 1? 2: 1;
				}
				if(flags[temp] == number) {
					return "No";
				}
				//System.out.println("top: " + top + " number " + number + " flags " + flags[temp]);

			}
		}
		
		
		
		return "Yes";
	}

}
