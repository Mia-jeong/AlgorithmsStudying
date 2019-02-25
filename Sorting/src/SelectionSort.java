public class SelectionSort extends SortParent {

	public static void main(String[] args) {

		int nums[] = input();
		
		selectionSort(nums);
		
		print(nums);
	}
	
	public static void selectionSort(int nums[]) {
		
		for (int i = 0; i < nums.length; i++) {
			int inx = i;
			for (int j = i; j < nums.length; j++) {
				if(nums[inx] > nums[j]) {
					inx = j;
				}
			}
			
			int temp = nums[i];
			nums[i] = nums[inx];
			nums[inx] = temp;
			
		}
	}
	
}
