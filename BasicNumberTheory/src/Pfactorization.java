import java.util.Scanner;

public class Pfactorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 2; n / i != 0;) {
			if(n % i == 0) {
				sb.append(i+"\n");
				n /= i;
			}else {
				i++;
			}
		}
		
		System.out.println(sb.toString());
	}
	

}
