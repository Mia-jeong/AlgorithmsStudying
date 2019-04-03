import java.util.Scanner;

public class TwoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();

		
		int s = 0, e = 0;
		int storages = 0;
		while( e < b.length()) {
			int x = (int) a.charAt(s);
			int y = (int) a.charAt(e);
			if(x != y ) {
				storages += 1;
			}else {
				s++;
			}
			e++;
		}
	}

}
