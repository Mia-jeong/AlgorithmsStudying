import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		sc.close();
		
		if( A.matches(".*"+B+".*") )
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}
