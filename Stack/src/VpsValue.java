import java.util.Scanner;
import java.util.Stack;

/*
<input>
(()[[]])([])

(2*(2+ (3*3))) + (2*3)
<output>
28
 */
public class VpsValue {

	static String vps = "";
	static int count = 1;
	public static void main(String[] args) {

		int result = vpsCaculator();
		
		if(result == -1) 
			System.out.println(0);
		else 
			System.out.println(result);
	}

	public static void scanner() {
		
		Scanner sc = new Scanner(System.in);
		vps = sc.next();
	
		
	}
	
	public static int  vpsCaculator() {
		
		scanner();
		
		int temp = 1;
		int sum = 0;
		Stack<String> s = new Stack<>();
		
		for (int i = 0; i < vps.length(); i++) {
			String currentVps = vps.charAt(i)+"";
			if(currentVps.equals(")") || currentVps.equals("]")) {
				String top = i - 1 < 0? "" : vps.charAt(i-1)+"";
				
				if(top.equals("(") || top.equals("[")) {
					sum = sum + temp;
				}
				
				if(currentVps.equals(")"))
					temp /= 2;
				if(currentVps.equals("]"))
					temp /= 3;
				
				s.pop();
				
			}else {
				
				if(currentVps.equals("("))
					temp *= 2;
				else
					temp *= 3;
				s.push(currentVps);
			}
			
		}
		
		if(!s.isEmpty()) return -1;
		else return sum;
		
	}
}
