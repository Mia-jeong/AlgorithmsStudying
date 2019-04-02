import java.util.Scanner;
import java.util.Stack;


/*
<input>
(())())
<output>
NO

<input>
(())
<output>
YES
 */
public class Vps {

	public static void main(String[] args) {
		
		String str = vpsCheck();
		System.out.println(str);

	}
	public static String vpsCheck() {
		
		Scanner sc = new Scanner(System.in);
		String vps = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < vps.length(); i++) {
			
			char c = vps.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			}else {
				
				if(stack.isEmpty()) 
					return "NO";
					
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		
		return "YES";
	}

}
