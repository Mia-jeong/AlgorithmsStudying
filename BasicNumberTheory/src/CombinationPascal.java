import java.util.Scanner;

public class CombinationPascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();		
		long result = nCr(a, b);

		System.out.println(result);
	}
	
	//유클리드 호제법 을 이용한 재귀 함수 nCr = n-1Cr-1 + n-1Cr
	public static long nCr(int n, int r) {
		if((n == 0 && r == 0) || r == 0 || n == r) {
			return 1;
		}else {
			return nCr(n-1, r-1) + nCr(n-1, r);
		}

	}

}
