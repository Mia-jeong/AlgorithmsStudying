import java.util.Scanner;

public class SquareUnion {

	public static void main(String[] args) {
		int tN = 101;
		int map[][] = new int[tN][tN];
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int squares[][] = new int[n][n];
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				squares[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		for (int i = 0; i < squares.length; i++) {
			int xS = squares[i][0];
			int yS = squares[i][1];
			int xE = squares[i][2];
			int yE = squares[i][3];
			
			for (int j = yS; j < yE; j++) {
				for (int z = xS; z < xE; z++) {
					if(map[j][z] == 0 ) {
						map[j][z] = 1;
						count++;
					}
				}
			}
		}

		System.out.println(count);
		
		
	}

}
