import java.util.Scanner;

public class Knum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int k = sc.nextInt();
		int nums[] = new int[count];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int num = selectionSort(nums, k);
		System.out.println(num);
	}
	
	public static int selectionSort(int nums[], int k) {
		
		for (int i = 0; i < nums.length; i++) {
			int inx = i;
			for (int j = i; j < nums.length; j++) {
				if(nums[inx] < nums[j]) {
					inx = j;
				}
			}
			
			int temp = nums[i];
			nums[i] = nums[inx];
			nums[inx] = temp;
			if(i == k) return nums[i-1];
			
		}
		return nums[k-1];
	}

}
