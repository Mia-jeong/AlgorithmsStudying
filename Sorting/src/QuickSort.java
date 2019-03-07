import java.util.Scanner;

public class QuickSort extends SortParent {
	//원소를 하나 정하여 (pivot) 해당 원소보다 작은 수 와 큰수들을 나눈다. 
	public static void main(String[] args) {
		int arr[] = input()
		quickSort(arr, 0, arr.length-1);
		
		print(arr);
	}
	
	public static void quickSort(int arr[], int s, int e) {
		
		if( s >= e ) return;
	
		//첫번째 숫자를 pivot으로 
		int pivot = arr[s];
		int left[] = new int[e-s+1]; //pivot 보다 작은 숫자 담을 배열 
		int right[] = new int[e-s+1]; //pivot 보다 큰 숫자 담을 배열 
		
		int left_Cnt = getLeft(arr, s+1, e, pivot, left);
		int right_Cnt = getRight(arr, s+1, e, pivot, right);
		
		//왼쪽
		for (int i = 0; i < left_Cnt ; i++) {
			arr[s+i] = left[i];
		}
		//pivot
		arr[s+left_Cnt] = pivot;
		//오른쪽
		for (int i = 0; i < right_Cnt; i++) {
			arr[(s+left_Cnt+1)+i] = right[i];
		}
		quickSort(arr, s, s+left_Cnt-1);
		quickSort(arr, s+left_Cnt+1, e);
		
	}

	//pivot 보다 작은 숫자를 left 배열에 넣어 준 후 갯수를 반환
	public static int getLeft(int arr[], int s, int e, int pivot, int left[]) {
		
		int idx = 0;
		for (int i = s; i <= e; i++) {
			if(arr[i] <= pivot) {
				left[idx++] = arr[i];
			}
		}
		return idx;
	
	}
	
	//pivot 보다 큰 숫자를 right 배열에 넣어 준 후 갯수를 반환
	public static int getRight (int arr[], int s, int e, int pivot, int right[]) {
		
		int idx = 0;
		for (int i = s; i <= e; i++) {
			if(arr[i] > pivot) {
				right[idx++] =arr[i];
			}
		}
		return idx;
	}
}
