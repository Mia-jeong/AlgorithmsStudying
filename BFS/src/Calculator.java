import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = calculator(n);
		System.out.println(result);
	}
	

	public static int calculator(int n ) {
		
		if (n == 1 ) return 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		int visited[] = new int[100000];
		
		queue.add(1);
		visited[1] = 1;
		visited[0] = 1;
		int result = 0;
		while(!queue.isEmpty()) {
			int top = queue.poll();
			int a = top * 2;
			int b = top / 3;
			//System.out.println(top +" " + a + " " + b);
			
			if(a == n || b == n) {
				result = visited[top];
				break;
			}
			
			if(a < 100000 && visited[a] == 0 ) {
				queue.add(a);
				visited[a] = visited[top]+1;
			}
			
			if(  b < 100000 && visited[b] == 0) {
				queue.add(b);
				visited[b] = visited[top]+1;
			}
		}
		
		return result;
		
	}

}
