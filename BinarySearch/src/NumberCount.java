import java.util.Arrays;
import java.util.Scanner;

/*
<input>
10 4
1 3 4 3 2 3 1 2 5 10
1 3 9 10
<output>
2
3
0
1
 */
public class NumberCount {

	static int[] nums;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		nums = new int[n];
		int[] inputNums = new int[m];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		for (int i = 0; i < inputNums.length; i++) {
			inputNums[i] = sc.nextInt();
		}
		
		//1. sorting the array
		Arrays.sort(nums);
		
		//2. binary Search 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < inputNums.length; i++) {
			int result = findCount(inputNums[i]);
			sb.append(result+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public static int findCount(int n) {
		int s = 0, e = nums.length-1;
		
		int result = 0;
		int idx = -1;
		while(s <= e) {
			int mid = (s+e)/2;
			int num = nums[mid];
			if(num == n) {
				idx = mid;
				break;
			}else if(num > n) {
				e = mid-1;
			}else {
				s = mid+1;
			}
		}
		
		if(idx != -1 ) {
			//left
			result +=1;
			for (int i = idx-1; i >= 0; i--) {
				if(nums[i] == n) result++;
			}
			//right
			for (int i = idx+1; i < nums.length; i++) {
				if(nums[i] == n) result++;
			}
		}
		
		return result;
	}
	
}
