import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		

		int s = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sb.append(s+" ");
				s++;
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		

	}

}
