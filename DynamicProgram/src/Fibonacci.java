import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			String result = dp(num);
			sb.append(result+"\n");
		}
		
		System.out.println(sb.toString());
		
	}

	public static String dp(int n) {
		int count = n+1 < 4 ? 4 : n+1;
		int[][] storages = new int[count][2];
		
		storages[0][0] = 1;
		storages[0][1] = 0;
		
		storages[1][0] = 0;
		storages[1][1] = 1;
		
		storages[2][0] = 1;
		storages[2][1] = 1;
		
		for (int i = 3; i < storages.length; i++) {
			storages[i][0] = storages[i-1][0]+storages[i-2][0];
			storages[i][1] = storages[i-1][1]+storages[i-2][1];
		}
		
		return storages[n][0]+" "+storages[n][1];
	}
}
