import java.util.Scanner;
/*
<input>
9 8
4 5
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0
0 0 0 0 0 1 0 0
0 0 0 1 0 1 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
<output>
4
<input>
9 8
4 6
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0
0 0 0 0 0 1 0 0
0 0 0 1 0 1 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
<output>
game over

 */
public class Mine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt()-1;
		int x = sc.nextInt()-1;
		
		int map[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		//left, right, up, down , left up diagonal, right up diagonal, left down diagonal, right down diagonal
		int yR[] = {0, 0, -1, 1, -1, -1, +1, +1}; 
		int xR[] = {-1, 1, 0, 0, -1, +1, -1, +1};
		int count = 0;
		if(map[y][x] == 1) {
			System.out.println("game over");
		}else {
			for (int i = 0; i < yR.length; i++) {
				int tY= yR[i] + y;
				int tX = xR[i] + x;
				
				if(tY < 0 || tY > n-1 || tX < 0 || tX > m-1)
					continue;
				
				else {
					if(map[tY][tX] == 1 ) count++;
				} 
					
			}
			System.out.println(count);
		}
		
		
	}

}
