import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		sc.close();
		
		boolean flag = false;
		// i = startPoint
		// j = endPoint
		for (int i = 0, j = input.length()-1; i < input.length()/2; i++, j--) {
			if(j > i) {
				String a = input.charAt(i)+"";
				String b = input.charAt(j)+"";
				if(!(a.equals(b))) {
					flag = true;
					break;
				}
			}
		}
		
		if(flag) 
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
