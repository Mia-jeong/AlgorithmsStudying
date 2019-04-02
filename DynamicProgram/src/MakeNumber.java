import java.util.Scanner;

public class MakeNumber {
//<input>
//5 3
//<output>
//13
	
//	M = 4
//	Table[1] = 1
//	Table[2] = Table[1] + 1
//	Table[3] = Table[2]+ Table[1] + 1
//	Table[4] = Table[3] + Table[2] + Table[1] + 1
//	(a+b+c) % x = {(a%x)+(b%x)+(c%x)} % x 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = 1000007;
		long table[] = new long[n+1];
		
		table[1] = 1;
		int sum = 0;
		
		for (int i = 2; i <= m; i++) {
			sum += table[i-1];
			table[i] = sum+1;
		}
		
		for (int i = m+1; i <=n; i++) {
			long temp = 0;
			for (int j = i-m; j <= i-1; j++) {
				temp += (table[j] % x);
			}
			
			table[i] = temp % x;
		}
		
		System.out.println(table[n]% 1000007);
	}

}
