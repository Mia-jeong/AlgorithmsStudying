import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		String result = "";
		while(num > 0 ) {
			result = num%2 + result;
			num /= 2;
		}
		System.out.println(result);
	}

}
