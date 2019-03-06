import java.util.Scanner;

public class NNdan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt(); 
		long m = sc.nextInt(); 
		
		long result = binarySearch(n, m);
		System.out.println(result);
		sc.close();
	
		
	}
	
	public static long binarySearch(long n, long m) {
		
		//1~NN 까지의 mid값을 구한다 
		long start = 1;
		long end = n*n;
		long finalResult = 0;
		while(start <= end  ) {
			long mid = (start+end)/2;
			long sum = 0;
			// 해당 값보다 작은 값들의 갯수를 구함
			/*
			 * 
			 ex)3X3 단 s == 1 e == 9 
			    mid 5
			    1단에서 5보다 작은것 : 5 / 1 = 5개>3개 (그러나 범위가 3까지므로 >>>3)
			    2단에서 5보다 작은것: 5 / 2 = 2개
			    3단에서 5보다 작은것 : 5 / 3 = 1개
			 
			 */
			for (int i = 1;((i <= mid) && (i <= n))  ; i++) {
				long t = mid/i > n ? n : mid/i;
				sum += t;
			}
			if(sum >= m){
				finalResult=mid;
				end = mid-1;
		    }
			else  {
				start = mid+1;
			} 
		}
		return finalResult;
	}


}
