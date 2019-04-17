import java.util.Scanner;

//백준 9095
//https://www.acmicpc.net/problem/9095
public class OneTwoThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int result = dp(num);
			sb.append(result+"\n");
		}
		System.out.println(sb.toString());
		
	}
	
	public static int dp(int num) {
		int count = num+1 < 4? 4 : num+1;
		int storages[] = new int[count];
		storages[1] = 1;
		storages[2] = 2;
		storages[3] = 4;
		for (int i = 4; i < storages.length; i++) {
			storages[i] = storages[i-1]+storages[i-2]+storages[i-3];
		}
		
		return storages[num];
	}

}
