import java.util.Scanner;

public class OXGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int nums[] = new int[c];
		for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
		
		int score = 1;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				sum += score;
				score++;
			}else {
				score = 1;
			}
		}
		System.out.println(sum);

	}

}
