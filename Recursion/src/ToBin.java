import java.util.Scanner;
/*
<input>
4 2
<output>
1100
1010
1001
0110
0101
0011
 */
public class ToBin {
	static String str[];
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int k = sc.nextInt();
		str = new String[n];
		toBin(0, k);
		
	}
	
	public static void toBin(int idx, int k) {
		
		if(k > 0 && idx == n) return;
		else if( idx == n) {
			print();
		}
		else {
			if(k == 0) {
				str[idx] = "0";
				toBin(idx+1, k);
			}else {
				str[idx] = "1";
				toBin(idx+1, k-1);
				str[idx] = "0";
				toBin(idx+1, k);
			}
		}
		
	}
	
	public static void print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}
		System.out.println(sb.toString());
	}

}
