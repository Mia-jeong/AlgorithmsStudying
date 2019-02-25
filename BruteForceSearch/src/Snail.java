import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();//가로
		int n = sc.nextInt();//세로
		int c = m - 1; //가로
		int r = n- 1; //세로
		int num = sc.nextInt(); //숫자
		
		int arr[][] = new int[n][m];

		int idx = 0;
		int growNum = 1;
		boolean flag = false;
		while(!flag) {
			//(1) ^
			for (int i = (r-idx); i >= 0+idx ; i--) {
				if(arr[i][0+idx] !=  0) {
					flag = true;
					break;
				};
				arr[i][0+idx] = growNum++;
			}

			//(2) >
			for (int i = (1+idx); i <= c-idx ; i++) {
				if(arr[0+idx][i] !=  0) {
					flag = true;
					break;
				} 
				arr[0+idx][i] = growNum++;
			}

			//(3) down
			for (int i = (1+idx); i <= r-idx ; i++) {
				if(arr[i][c-idx]  !=  0) {
					flag = true;
					break;
				} 
				arr[i][c-idx] = growNum++;
			}

			//(4) <
			for (int i = (c-1-idx); i >= 1+idx ; i--) {
				if(arr[r-idx][i]  !=  0) {
					flag = true;
					break;
				} 
				arr[r-idx][i] = growNum++;
			}

			idx++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}
	
	public static int[] findPosition(int j, int i, int m, int n) {
		int result[] = {(j+1), (n-i)};
		return result;
	} 

}
