import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/*

<input>
10 10
0 0 0 0 0 0 1 1 0 0
0 1 1 1 0 0 1 0 1 0 
0 1 1 1 0 0 1 0 1 0
0 0 0 0 0 0 0 0 1 0
0 0 1 1 1 1 0 0 1 0
0 0 0 0 0 0 1 1 0 0
0 0 1 1 1 0 1 1 0 0
0 0 1 1 1 0 0 0 0 0 
0 0 0 0 0 1 1 1 0 0
0 0 0 0 0 0 0 1 0 0

<output>
18

<input>
10 10
0 0 0 0 0 0 1 1 0 0
0 1 1 1 0 0 1 1 1 0
0 1 1 1 0 0 1 1 1 0
0 0 0 0 0 0 0 1 1 0
0 0 1 1 1 1 0 1 1 0
0 0 0 0 0 0 1 1 0 0
0 0 1 1 1 0 1 1 0 0
0 0 1 1 1 0 0 1 0 0
0 0 0 0 0 1 1 1 1 1
0 0 0 0 0 0 0 1 0 0

<output>
22
*/
public class CarpenterMaze {

	public static class Container{
		int y, x, distance, axe;
		public Container(int y, int x, int distance, int axe) {
			super();
			this.y = y;
			this.x = x;
			this.distance = distance;
			this.axe = axe;
		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x[] = {-1, 0, 1, 0};
		int y[] = {0, -1, 0, 1};
		int maze[][] = new int[n][m];
		boolean visited[][][] = new boolean[n+1][m+1][2]; // [1] = y좌표 / [2] = x좌표  / [3] = 도끼 여부 > 해당 좌표 방문 확인은 도끼를 가지고 있었을때랑 아니 었을때랑 둘다 가능성을 확인 해줘야함
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		
		Queue<Container> queue = new LinkedList<Container>();
		
		queue.add(new Container(n-1, 0, 0, 0));
		visited[n-1][m][0] = true;
		int result = 0;
		while(!queue.isEmpty()) {
			
			Container top = queue.poll();
			
			if(top.y == 0 && top.x == m-1) {
				result = top.distance;
				break;
			}
			for (int i = 0; i < x.length; i++) {
			
				int tempY = top.y + y[i];
				int tempX = top.x + x[i];
				
				if(tempY < n && tempY >= 0 && tempX < m && tempX >= 0) {
					
					if(maze[tempY][tempX] == 0 && !visited[tempY][tempX][top.axe]) {
						queue.add(new Container(tempY, tempX, top.distance+1, top.axe));
						visited[tempY][tempX][top.axe] = true;
					}
					else if(maze[tempY][tempX] == 1 && top.axe == 0) {
						queue.add(new Container(tempY, tempX, top.distance+1, 1));
						visited[tempY][tempX][1] = true;
					}
				}
			}
			
		}
		
		System.out.println(result);
		
	}

}
