import java.util.Scanner;

public class SortParent {


	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int nums[] = new int[count];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}
	
	public static void print(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
