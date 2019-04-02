import java.util.Scanner;

/*
<input>
25 12
<output>
2 
 
*/
public class CombinationZero {


	//푸는법
	//0개의 개수를 정하는건 10의 개수
	//10^N = 2^N * 5 *N 즉 2와 5의 쌍이 10의 개수를 정함
	//ex) 1, '2', 3, 4, '5'  =  120 > 2와 5의 쌍이 1개 따라서  0은 1개
	//ex) 1~10 = 3628800 > 2와 5의 쌍이 2개 따라서 0이 2개
	//2의 배수는 충분히 많으므로 5의 배수만 구하면 됨
	// 2의 배수는 범위/2 몫 이 2보다 작을때까지 나누고 2 몫을 다더한 값이 범위내의 2의 배수 개수임
	// 5의 배수는 범위/5 몫 이 5보다 작을때까지 나누고5 몫을 다더한 값이 범위내의 2의 배수 개수임
	
	// nCr = n!/r!(n-r)!
	// 소인수 분해 해서 해당 수의 약분 
	// n! 5의갯수 - (r!5의갯수 + n-r!5의 갯수)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();		
		
		int CountOfFive = count(a, 5) - ( count(b, 5) + count(a-b, 5));

		int CountOftwo =  count(a, 2) - ( count(b, 2) + count(a-b, 2));

		
		int result = CountOfFive;
		if(CountOfFive > CountOftwo) {
			result = CountOftwo;		
		}

		System.out.println(result);
	}
	

	public static int count(int n, int number) {
		int count = 0;
		while(true) {
			
			int result = n/number;
			if(result  == 0 ) {
				break;
			}else {
				count += result;
				n = result;
			}
		}
		return count;
	}

}
