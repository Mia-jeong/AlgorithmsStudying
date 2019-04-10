import java.util.Scanner;

/* 
distance between 2 strings

<input>
abcabcd
abccabc

<output>
2 
*/
public class TwoStringDP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();
		
		int n = a.length()+1;
		int m = b.length()+1;
	
		int storages[][] = new int[n][m];

		
		//기저조건
		for (int i = 1; i <storages.length; i++) {
			storages[i][0] = i;
		}
		for (int i = 1; i < storages[0].length; i++) {
			storages[0][i] = i;
		}		
		
		
		for (int i = 1; i < storages.length; i++) {
			for (int j = 1; j < storages[i].length; j++) {
				int tempA = (int) a.charAt(i-1);
				int tempB = (int) b.charAt(j-1);
				int min = Math.min(storages[i-1][j]+1, storages[i][j-1]+1);
				if(tempA == tempB) {
					storages[i][j] =   Math.min(min, storages[i-1][j-1]);
				}else {
					storages[i][j] = min;
				}
			}
		}
//		
//		for (int i = 0; i < storages.length; i++) {
//			for (int j = 0; j < storages[i].length; j++) {
//				System.out.print(storages[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println(storages[n-1][m-1]);
		
	}

}
