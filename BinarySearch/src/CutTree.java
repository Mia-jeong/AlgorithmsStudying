import java.util.Arrays;
import java.util.Scanner;

/*
<input>
4 7
20 15 10 17

<output>
15
 */
public class CutTree {

	static long arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long countT = sc.nextLong(); // tree counts
		long countS = sc.nextLong(); // sum counts
		
		arr = new long[(int) countT];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		
		//1. sorting
		Arrays.sort(arr);
		long result = binarySearch(1, arr[arr.length-1], countS);
		System.out.println(result);
	}

	public static long binarySearch(long start, long end, long countS) {
		
		long s =start, e =end;
		//s : 1 e: 정렬된 배열중 마지막 index 값(즉 배열의 최대값)
		long finalResult = 0;
		while( s <= e) {
			long mid = (s+e) /2;
			long result =getSum(mid);
			if(result >= countS) {
				if(mid > finalResult) finalResult = mid;
				s = mid+1;
			}else {
				e = mid-1;
			}
		}
		
		return finalResult;
	}
	
	public static long getSum (long cut) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > cut) sum += (arr[i]-cut);
		}
		return sum;
	}

}
