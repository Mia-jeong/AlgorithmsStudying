import java.util.Scanner;

public class Seat3 {

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
		int result[] = new int[2];
		boolean flag = false;
		if(m*n < num ) {
			System.out.println("0");
		}else {
			while(!flag) {
			
			//(1) ^
				for (int i = (r-idx); i >= 0+idx ; i--) {
					int a = 0+idx;
					if(arr[i][a] !=  0) {
						flag = true;
						break;
					} 
					arr[i][a] = growNum++;
					if(arr[i][a]  == num) {
						result = findPosition(a, i, m, n);
						flag = true;
						break;
					}
				}
	
				//(2) >
				for (int i = (1+idx); i <= c-idx ; i++) {
					int a = 0+idx;
					if(arr[a][i] !=  0) {
						flag = true;
						break;
					}
					arr[a][i] = growNum++;
					if(arr[a][i]  == num) {
						result = findPosition(i, a, m, n);
						flag = true;
						break;
					}
				}
	
				//(3) down
				for (int i = (1+idx); i <= r-idx ; i++) {
					int a  = c-idx;
					if(arr[i][a]  !=  0) {
						flag = true;
						break;
					}
					arr[i][a] = growNum++;
					if(arr[i][a]  == num) {
						result = findPosition(i, a, m, n);
						flag =true;
						break;
					}
				}
				
	
				//(4) <
				for (int i = (c-1-idx); i >= 1+idx ; i--) {
					int a = r-idx;
					if(arr[a][i]  !=  0) {
						flag = true;
						break;
					} 
					arr[a][i] = growNum++;
					if(arr[a][i]  == num) {
						result = findPosition(i, a, m, n);
						flag = true;
						break;
					}
				}
	
				if(flag ) {
					System.out.println(result[0] + " " + result[1]);
				}
				idx++;
			}
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
