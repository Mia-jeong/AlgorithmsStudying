import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 9;
		int nums[] = new int[c];
		
		
		for (int i = 0; i < nums.length; i++) 
			nums[i] = sc.nextInt();
		
		int max = nums[0], index = 1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] > max ) {
				max = nums[i];
				index = (i+1);
			}
		}

		System.out.println(max);
		System.out.println(index);
	}

}
