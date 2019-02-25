import java.util.Scanner;

/*
<input>
2
0 0 10 10
2 2 6 6

<output>
64
36
 */
public class ColorPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int range = 101;
		int[][] panel = new int[range][range];
		int[][] papers = new int[c][4];
		int[] results = new int[c];
		
		for (int i = 0; i < papers.length; i++) {
			for (int j = 0; j < papers[i].length; j++) {
				papers[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < papers.length; i++) {
			int y = papers[i][0];
			int x = papers[i][1];
			int height = papers[i][2];
			int width = papers[i][3];
			for (int j = y; j < height+y; j++) {
				for (int z = x; z < width + x; z++) {
					panel[j][z] = (i+1);
				}
			}
		}
		
		for (int i = 0; i < panel.length; i++) {
			for (int j = 0; j < panel[i].length; j++) {
				int num = panel[i][j];
				if(num != 0) {
					results[num-1]++;
				}
			}
		}
		
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
		
		
	}

}
