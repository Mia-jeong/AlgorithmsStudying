import java.util.Scanner;

/*
<input>
1
<output>
1 1 1 1 1 1 1 1 1 1 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0  

<input>
3
<output>
1 0 0 1 1 1 1 1 1 1
0 1 0 1 1 1 1 1 1 1
0 0 1 1 1 1 1 1 1 1
1 1 1 0 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0 0
 */
public class InOut2 {

	public static void main(String[] args) {
		int n = 10;
		int inOut[][] = new int[n][n];
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			
			//column
			for (int j = 0; j < inOut.length; j++) {
				if(inOut[i][j] == 1) inOut[i][j] = 0;
				else inOut[i][j] = 1;
			}
			//row
			for (int j = 0; j < inOut.length; j++) {
				if(inOut[j][i] == 1) inOut[j][i] = 0;
				else inOut[j][i] = 1;
			}
			
			if(inOut[i][i]  == 1) inOut[i][i]  = 0;
			else inOut[i][i] = 1;
		}
		
		for (int i = 0; i < inOut.length; i++) {
			for (int j = 0; j < inOut[i].length; j++) {
				System.out.print(inOut[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	

}
