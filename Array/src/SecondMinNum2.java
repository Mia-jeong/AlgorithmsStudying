import java.util.Scanner;

public class SecondMinNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 9;
		int nums[] = new int[c];
		
		

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int min = nums[0], minIdx = 1,sMin = nums[0], sMinIdx = 1;
		for (int i = 1; i < nums.length; i++) {
			
			if(min > nums[i]) {
				sMin = min;
				sMinIdx = minIdx;
				min = nums[i];
				minIdx = (i+1);
			}
			else if(nums[i] < sMin && nums[i] != min ) {
				sMin = nums[i];
				sMinIdx = (i+1);
			}
		}

		System.out.println(sMin);
		System.out.println(sMinIdx);


	}

}
