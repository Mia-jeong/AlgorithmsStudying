import java.util.Scanner;

public class Chebyshevtheo {
	//1. 에라토스테네스의 체
	//2. 최대범위까지 담을 수 있는 배열 만든 후 0 은 소수 -1은 소수아님으로 구분
	//3. 처음 선언했을 당시 값이 모두 0 = 소수 라고 가정
	//4. 2(n) 부터 n*n 이 range 범위 까지 반복문 돌림
	//5. 배열[n] 값이 -1이 아닐때 소수 값들의 배수들을 반복문으로 구해 -1로표시
	static int range = (123456)*2;
	static int array[] = new int [range+1];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		findPrime(range);
		while(true) {
			int n = sc.nextInt();
			if(n == 0 ) break;
			int count = 0;
			for (int i = n+1; i <= 2*n; i++) {
				if(array[i] == 0) {
					count++;
				}
			}
			sb.append(count+"\n");
		}
		
		System.out.println(sb.toString());
	}
	

	//1 부터 해당범위까지 소수가 아닌것들 다 제외 
	public static void findPrime(int end) {

		array[0] = -1;
		array[1] = -1;
		for (int i = 2; i*i <= end; i++) {
			if(array[i] != -1 ) {
				for (int j = i; i*j <= end; j++) {
						array[i*j] = -1;
				}
			}
		}
	
	}

}
