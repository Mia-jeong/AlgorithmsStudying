import java.util.Scanner;
/*
<input>
5
<output>
4+1
3+2
3+1+1
2+2+1
2+1+1+1
1+1+1+1+1
6
*/
public class Division {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = n-1; i >= 1; i--) {
			division(i, n-i, i+"");
		}
		System.out.println(count);
	}
	
	public static void division(int n, int sum, String str) {
		if(sum == 0) {
			System.out.println(str);
			count++;
		}else {
			for (int i = n; i >= 1 ; i--) {
				if(sum-i >= 0) division(i, sum-i, str+"+"+i);
			}
		}
	}

}
