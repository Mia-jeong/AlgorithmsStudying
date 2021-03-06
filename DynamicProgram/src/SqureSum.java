import java.util.Scanner;

/*
<input>
5 5 3
 1 -2 3 2 8
-8 -9 3 4 5
 2 4 7 8 2
 1 4 3 1 4
-1 2 5 -6 3
1 2 3 4
0 0 1 1
2 0 2 1

<output>

37
-18
6
*/
public class SqureSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = sc.nextInt();
		

		long storages[][] = new long[n+1][m+1];
		int arr[][] = new int [count][4];
		
		for (int i = 1; i < storages.length; i++) {
			for (int j = 1; j < storages[i].length; j++) {
				storages[i][j] = sc.nextInt();
			}
		}
		for (int i = 1; i < storages.length; i++) {
			for (int j = 1; j < storages[i].length; j++) {
				storages[i][j] = (storages[i-1][j] + storages[i][j-1] + storages[i][j])-storages[i-1][j-1];
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			int x1 = arr[i][0]+1;
			int y1 = arr[i][1]+1;
			int x2 = arr[i][2]+1;
			int y2 = arr[i][3]+1;
			long tempResult = storages[x2][y2] - storages[x2][y1-1]- storages[x1-1][y2]+ storages[x1-1][y1-1];
			System.out.println(tempResult);
		}

	}
	


}
