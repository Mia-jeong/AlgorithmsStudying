import java.util.Scanner;

/*
<input>
3
27 8 28
18 36 40
7 20 8
<output>
87

*/
public class Button {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nums[][]= new int[n][3];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		int max = Math.max(nums[0][0], nums[0][1]);
		max = Math.max(max, nums[0][2]);
		
		for (int i = 1; i < n; i++) {

			for (int j = 0; j < nums[i].length; j++) {
				int a = (j+1) % 3;
				int b = (j+2) % 3;
				nums[i][j] = Math.max(nums[i][j]+nums[i-1][a], nums[i][j]+nums[i-1][b]);
				if(nums[i][j] > max ) max = nums[i][j];
			}
	
		}
		
		System.out.println(max);
	}
	


}
