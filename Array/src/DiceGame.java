import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 3;
		int players = sc.nextInt();
		
		int nums[][] = new int[players][count];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		int maxReward = 0; 
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i][0], b = nums[i][1], c = nums[i][2];
			int result = calculator(a, b, c);
			if(result > maxReward) maxReward = result;
		}
		
		System.out.println(maxReward);
		
	}
	
	public static int calculator(int a, int b, int c) {
		if(a == b && b == c) {
			return (a * 1000) + 10000;
		}
		else if(a == b || a == c ) {
			return (a * 100) + 1000;
		}
		else if( b == c ) {
			return (b * 100) + 1000;
		}
		else {
			return getMax(a, b, c) * 100;
		}
	}
	
	public static int getMax ( int a, int b , int c) {
		int temp = a > b? a : b;
		return temp > c ? temp : c;
	}

}
