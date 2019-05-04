import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		int result = virus(n, s);
		System.out.println(result);
		
		
	}
	
	public static int virus(int n, int s) {
		
		Queue<Integer> queue = new LinkedList<Integer>(); 
		boolean visited[] = new boolean[n+1];
		queue.add(s);
		visited[s] = true;
		visited[0] =true;
		int result = 0;
		while(!queue.isEmpty()) {
			int top = queue.poll();
			result++;
			int a = top * 2;
			int b = top / 3;
			
			if(a <= n && !visited[a]) {
				queue.add(a);
				visited[a] = true;
			}
			
			if(b <= n && !visited[b]) {
				queue.add(b);
				visited[b] = true;
			}
		}
		
		return n-result;
	}

}
