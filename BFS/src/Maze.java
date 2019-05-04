import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {

	static int houses[][]; 
	static int n;
	static int m;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		houses = new int[n][m];
		
		for (int i = 0; i < houses.length; i++) {
			for (int j = 0; j < houses[i].length; j++) {
				houses[i][j] = sc.nextInt();
			}
		}
		
		int result = bfs(n-1, 0);
		System.out.println(result);
		
	}
	
	public static int bfs(int a, int b) {
		int x[] = {-1, 0, 1, 0};
		int y[] = {0, -1, 0, 1};
		int result = 0;
		Queue<Container> queue = new LinkedList<Container>();
		
		queue.add(new Container(a, b, 0));
		houses[a][b] = -1;

		while( ! queue.isEmpty() ) {
			Container head = queue.poll();
			result = head.distance;
			if(head.y == 0 && head.x == m-1) return head.distance;
			
			for (int i = 0; i < y.length; i++) {
				int tX = head.x + x[i];
				int tY = head.y + y[i];
				
				if(tX >= 0 && tY >= 0 && tX < m && tY < n) {
					if(houses[tY][tX] == 0) {
						queue.add(new Container(tY, tX, head.distance+1));
						houses[tY][tX] = -1;
					}
				}
			}
		}
		
		return result;
	}

	public static class Container{
		int y, x, distance;

		public Container(int y, int x, int distance) {
			super();
			this.y = y;
			this.x = x;
			this.distance = distance;
		}

	}
}
