import java.util.Scanner;
/*
<input>
0 3 0 0 0 0 0 0
3 1 0 0 0 0 2 0
0 3 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0

<output>
1




 */
public class Rook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 8;
		
		int chess[][] = new int [n][n];
		
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[i].length; j++) {
				chess[i][j] = sc.nextInt();
			}
		}
		
		
		boolean flag = false;
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[i].length; j++) {
				if(chess[i][j] == 1) {
					flag = findKing(i, j, chess);
					if(flag) break;
					
				}
			}
			if(flag) break;
		}
		
		if(flag) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	

	
	public static boolean findKing(int y, int x, int chess[][]) {
		//column left
		for (int i = x-1; i >= 0; i--) {
			if(chess[y][i] == 2) 
				return true;
			if(chess[y][i] == 3)
				break;
		}
		
		//column right
		for (int i = x+1; i < chess.length; i++) {
			if(chess[y][i] == 2) 
				return true;
			if(chess[y][i] == 3)
				break;
		}
		
		//row left
		for (int i = y-1; i >= 0; i--) {
			if(chess[i][x] == 2) 
				return true;
			if(chess[i][x] == 3)
				break;
		}
		
		//row right
		for (int i = y+1; i < chess.length; i++) {
			if(chess[i][x] == 2) 
				return true;
			if(chess[i][x] == 3)
				break;
		}
		
		return false;
	}

}
