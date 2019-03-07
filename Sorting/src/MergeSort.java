
public class MergeSort extends SortParent {

	public static void main(String[] args) {

		int arr[] = input();
		mergeSort(arr, 0, arr.length-1);
		print(arr);

	}

	public static void mergeSort(int arr[], int s, int e) {
		
		//하나일때
		if( s >= e ) {
			return;
		}
		else {
			int mid = (s+e)/2;
			//왼쪽 mergeSort
			mergeSort(arr, s, mid);
			//오른쪽 mergeSort
			mergeSort(arr, mid+1, e);
			
			merging(arr, s, mid, mid+1, e);
		}
	}
	
	public static void merging(int arr[], int s1, int e1, int s2, int e2) {
		
		int temp[] = new int[(e2-s1)+1];
		int temp_idx = 0;
		
		int p = s1;
		int q = s2;
		
		while(p <= e1 && q <=e2) {
			if(arr[p] <= arr[q]) {
				temp[temp_idx++] = arr[p];
				p++;
			}else {
				temp[temp_idx++] = arr[q];
				q++;
			}
		}
		
		if(p > e1) {
			for (int i = q; i <= e2; i++) {
				temp[temp_idx++] = arr[i];
			}
		}else {
			for (int i = p; i <= e1; i++) {
				temp[temp_idx++] = arr[i];
			}
		}
		
		for (int i = s1; i <= e2; i++) {
			arr[i] = temp[i-s1];
		}
	}
}
