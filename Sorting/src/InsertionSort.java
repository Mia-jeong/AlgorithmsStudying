
public class InsertionSort extends SortParent {

	public static void main(String[] args) {
		
		int nums[] = input();
		insertionSort(nums);
		print(nums);
	}

	public static void insertionSort(int nums[]) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j >= 1; j--) {
				if(nums[j-1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}else break;
			}
		}
		
	}
	
}
