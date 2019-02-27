import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        int len = input.length();
        sc.close();
        
        
        for (int i = len-1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
	}

}
