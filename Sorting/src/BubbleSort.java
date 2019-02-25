
public class BubbleSort extends SortParent {

	public static void main(String[] args) {
		int nums[] = input();
		bubbleSort(nums);
		print(nums);
	}
	
	public static void bubbleSort(int nums[]) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < (nums.length-1)-i; j++) {
				if(nums[j+1] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}

}
