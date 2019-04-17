import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int n = a.length();
		
		int storages[][] = new int[n][n];
		
		for (int i = n-2, z = 1; i >= 0; i--, z++) {
			for (int j = n-z; j < n; j++) {
				int tempA = (int) a.charAt(i);
				int tempB = (int) a.charAt(j);
				if(tempA == tempB) {
					storages[i][j] = storages[i+1][j-1];
				}
				else {
					storages[i][j] = Math.min(storages[i][j-1], storages[i+1][j])+1;
				}
			}
		}
//		for (int i = 0; i < storages.length; i++) {
//			for (int j = 0; j < storages[i].length; j++) {
//				System.out.print(storages[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println(storages[0][n-1]);
	}

}
