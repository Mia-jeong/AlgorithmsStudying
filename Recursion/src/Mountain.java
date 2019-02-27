import java.util.Scanner;
/*

<input>
3
<output>
1213121
*/
public class Mountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = mountain(n);
		
		System.out.println(result);
	}
	
	public static String mountain(int n) {
		if(n == 1) return 1+"";
		
		return mountain(n-1)+n+mountain(n-1);
	}

}
