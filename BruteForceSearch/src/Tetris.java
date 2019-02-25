import java.util.Scanner;

/* 
<input>
6 7
0 0 0 0 0 0
0 0 0 0 0 0
1 1 1 0 0 1
1 1 1 0 0 1
1 1 1 0 1 1
1 1 1 0 1 1
1 1 1 0 1 1

<output>
4 3

*/
public class Tetris {

	static int map[][];
	static int c = 0;
	static int r = 0;
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	  		c =sc.nextInt();
	  		r = sc.nextInt();
	  		
	  		map = new int[r][c];
	  		
	  		for (int i = 0; i < map.length; i++) {
	  			for (int j = 0; j < map[i].length; j++) 
	  				map[i][j] = sc.nextInt();
	  		}
	  		
	  		int maxCount = 0, maxX = 0;
	  		for (int i = 0; i < c; i++) {
	  			int y = r;
	  			//find the position which has the value of 1 on each row
	  			//if you find it, sums the count of 1 on each column ranging from y-1(row) to 0 >> calculator method
	  			
	  			for (int j = 0; j < r; j++) {
	  				if(map[j][i] == 1 ) {
	  					y = j;
	  					break;
	  				}
	  			}
	  			int count = calculator(y);
	  			if(count > maxCount ) {
	  				maxCount = count;
	  				maxX = i;
	  			}
	  		}
	  		
	  		if(maxCount == 0) System.out.println(0 +" " + 0);
	  		else System.out.println((maxX+1)+ " " + maxCount);
	}
	
    public static int calculator(int y) {
    	
  		if(y - 4 < 0) return 0;
  		else {
  			int result = 0;
  			
	  		for (int i = y-1; i >= 0; i--) {
	  			int count = 0;
	  			for (int j = 0; j < c; j++) {
	  				if(map[i][j] == 1) count++;
	  			}
	  			//the sum should be 5(r-1) except the current row.
	  			if(count ==c-1) result++;
	  		}
	  		return result;
  		}
	 }
	
	

}
