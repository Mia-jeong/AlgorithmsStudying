import java.util.Scanner;


//[s, e]   s<= x <= e
//(s, e)   s < x < e
public class MaxNum {

	static int arr[];
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = getSubMax(0, n-1);
		System.out.println(result);
	}
	
	public static int getSubMax(int start, int end) {
		//arr 의 start 부터 end 까지 구간 중 연속 부분 최대합을 반환하는 함수
		if(start >= end ) return arr[start];
		int mid = (start+end) /2 ;
		
		int left = getSubMax(start, mid); //왼쪽부분
		int right = getSubMax(mid+1, end); //오른쪽부분
		
		//중간 부분을 포함하는 연속부분 중 최대합을 구하자
		// 1 8 -5 3 | 2 5 -10 2
		//       mid
		
		int leftSum = 0;
		int leftMax = -9897892;
		for (int i = mid; i >= start; i--) {
			leftSum = leftSum + arr[i];
			if(leftMax < leftSum) leftMax = leftSum;
		}
		
		int rightSum = 0;
		int rightMax = -9897892;
		for (int i = mid+1; i <= end; i++) {
			rightSum = rightSum + arr[i];
			if(rightMax< rightSum) rightMax = rightSum;
		}
		
		int myMax = leftMax + rightMax; //중간값 
		
		if(left >= right && left >= myMax) return left;
		else if( right >= left && right >= myMax) return right;
		else return myMax;
	}

}
