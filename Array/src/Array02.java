import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int nums[][] = new int[r][c];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(nums[n][m]);
  	}

}
