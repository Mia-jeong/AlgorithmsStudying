import java.util.Scanner;

public class MaxSum {
	//연속부분 최대합
	//for start = 0 to n
	// for end = start to n
	// 	mySum = getSum(data, start, end)
    //	   if mySum > myMax
    //	      myMax =mySum
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c =sc.nextInt();
		int arr[] = new int[c];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		//method 1
		for (int start = 0; start < arr.length; start++) {
			int temp = 0;
			for (int end = start; end < arr.length; end++) {
				temp += arr[end];
				if(temp > max) max = temp;
			}
		}
		
		//method 2
		int sum[] = new int[c];
		sum[0] = arr[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i-1]+ arr[i];
		}
		for (int start = 0; start < arr.length; start++) {
			
			for (int end = start; end < arr.length; end++) {
				int temp = 0;
				if(start == 0 ) temp = sum[end];
				else temp = sum[end] - sum[start-1];
				if(temp > max) max = temp;
			}
		}
		System.out.println(max);
	}

}
