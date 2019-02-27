import java.util.Scanner;


/*
<input>
4 7 10
2 6 18
0 0 0

<output>
AP 13
GP 54
 */
public class NextNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			if(b-a == c-b) sb.append("AP " + (c+(c-b)));
			
			else sb.append("GP " + (c*(c/b)));
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
