import java.util.Scanner;
import java.util.Stack;

public class Dish {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//아스키
		String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w","x","y", "z"};
		
		int count = str.length();
		StringBuilder sb = new StringBuilder();
		int bIdx = 0;
		for (int i = 0; i < count;) {
			int size = s.size();
			if(size == 0 ) {
				s.push(arr[i]);
				sb.append("push\n");
				i++;
			}else {
				
				String temp = s.peek();
				String now =str.charAt(bIdx)+"";
				if(temp.equals(now)) {
					s.pop();
					sb.append("pop\n");
					bIdx++;
				}else {
					s.push(arr[i]);
					sb.append("push\n");
					i++;
				}
			}
		}

		while(s.size() != 0) {
			String temp = s.peek();
			String now =str.charAt(bIdx)+"";
			if(temp.equals(now)) bIdx++;
			s.pop();
			sb.append("pop\n");
		}
		
		if(bIdx < count-1) {
			System.out.println("impossible");
		}else {

			
			System.out.println(sb.toString());
		}
	}

}
