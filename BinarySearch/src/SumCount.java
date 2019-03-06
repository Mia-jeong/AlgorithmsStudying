import java.util.Scanner;
/*
<input>
9 14
2 1 8 1 3 7 2 6 3
<output>
3
*/

public class SumCount {

	static int nums[];
	static int totalSum;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		totalSum = sc.nextInt();
		
		nums = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
	
		int result = 0;
		if(check(1)) {
			result = 1;
		}else if(!check(n)) {
			result = -1;
		}else {
			result = parametricSearch();
		}
		
		System.out.println(result);
	}

	public static boolean check(int interval) {
		
		// 1 2 3 4 5 6
		// -----
		//   -----
		//     -----
		int sum = 0;
		for (int i = 0; i < interval; i++) {
			sum += nums[i];
		}
		
		if(sum>= totalSum) return true;
		
		for (int i = 0; i < nums.length-interval; i++) {
			int temp = sum - nums[i] + nums[i+interval];
			sum = temp;
			if(sum>= totalSum) return true;
		}
		
		return false;
	}
	
	public static int parametricSearch () {
		
		// 1 2 3 4 5 6 7 8 9 10 11 12
		// X X X X X X O O O  O O  O
		// X와 O의 경계를 구하자 
		// s 는 언제나 X를 포인팅
		// e 는 언제나 O를 포인팅
		
		int s = 1, e = nums.length;
		int result = 0;
		while(s<= e) {
			int mid = (s+e)/2;
			
			boolean flag = check(mid);
			if(flag) {
				result = mid;
				e = mid-1;
			}else {
				s = mid+1;
			}
		}
		
		return result;
	}
}
