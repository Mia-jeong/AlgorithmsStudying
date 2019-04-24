import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class HouseNumber {
	
	static List<Integer> resultList = new LinkedList<Integer>();
	static int houses[][]; 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		String	houseStr[] = new String[n];
		houses = new int[n+2][n+2];
		
		for (int i = 0; i < houseStr.length; i++) {
			houseStr[i] = sc.next();
		}
		
		for (int i = 1; i < houses.length-1; i++) {
			for (int j = 1; j < houses.length-1; j++) {
				houses[i][j] = Integer.parseInt(houseStr[i-1].charAt(j-1)+"");
			}
		}

		for (int i = 1; i < houses.length-1; i++) {
			for (int j = 1; j < houses.length-1; j++) {
				int temp = houses[i][j];
				if(temp == 1) {
					count++;
					int result = dfs(i, j);
					resultList.add(result);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(count+"\n");
		Collections.sort(resultList);
		for (int i = 0; i < resultList.size(); i++) {
			sb.append(resultList.get(i)+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public static int dfs(int a, int b) {
		
		int result = 0;
		
		int x[] = {-1, 0, 1, 0};
		int y[] = {0, -1, 0, 1};
		
		Stack<Container> stack = new Stack<Container>();
		stack.push(new Container(a, b));
		houses[a][b] = -1;
		
		while(! stack.isEmpty() ) {
			Container top = stack.pop();
			result++;
			for (int i = 0; i < y.length; i++) {
				int tY = top.y + y[i];
				int tX = top.x + x[i];
				int temp = houses[tY][tX];
				
				if(temp == 1) {
					stack.push(new Container(tY, tX));
					houses[tY][tX] = -1;
				}
			}
		}
		
		return result;
	}
	
	public static class Container{
		int y, x;
		public Container(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
	}

}
