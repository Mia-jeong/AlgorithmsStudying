import java.util.Scanner;

/*
<input>
4 2
<output>
ab
ac
ad
ba
bc
bd
ca
cb
cd
da
db
dc
*/
public class Permutation {

	static boolean flags[];
	static int n;
	public static void main(String[] ars) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();  
		int r = sc.nextInt();  
		flags = new boolean[n];
		
		permutation(r, "");
		
	}
	
	public static void permutation (int idx, String sb) {
		if(idx > 0) {
			for (int i = 0; i < flags.length; i++) {
				if(flags[i] == false) {
					flags[i] = true;
					String temp = (char)(i+97)+"";
					permutation(idx-1, sb+temp);
					flags[i] = false;
				}
			}
		}
		else {
			System.out.print(sb);
			System.out.println();
		}
		
	}

}
