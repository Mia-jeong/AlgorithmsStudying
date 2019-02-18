import java.util.Scanner;

public class ReversePrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int nums[] = new int[c];
		
		for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
		
		for (int i = (nums.length-1); i >= 0; i--) System.out.print(nums[i]+" ");
		
	}

}
