import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String result = binary(n);
		System.out.println(result);
	}
	
	public static String binary(int n) {
		
		if(n == 1 || n == 0) {
			return n+"";
		}
		
		return binary(n/2) + n%2;
	}

}
