import java.util.Scanner;

public class SecondMinNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 9;
		int nums[] = new int[c];
		
		
		int min = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = sc.nextInt();
			nums[i] = temp;
			if(i == 0)min = temp;
			else {
				if(min > temp ) min = temp;
			}
		}
		int sMin = 10000000, sMinIdx = -1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < sMin && nums[i] > min ) {
				sMin = nums[i];
				sMinIdx = (i+1);
			}
		}

		System.out.println(sMin);
		System.out.println(sMinIdx);

	}

}
