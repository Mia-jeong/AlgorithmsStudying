import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int storages[][] = new int [n+1][m+1];
		for (int i = 1; i < storages.length; i++) {
			for (int j = 1; j < storages[i].length; j++) {
				storages[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i < storages.length; i++) {
			for (int j = 1; j < storages[i].length; j++) {
				int a  = storages[i][j]+ storages[i-1][j];
				int b  = storages[i][j]+ storages[i][j-1];
				storages[i][j] = a>b?a:b;
				//System.out.print(storages[i][j]+ " ");
			}
			//System.out.println();
		}
		
		System.out.println(storages[n][m]);
	}

}
