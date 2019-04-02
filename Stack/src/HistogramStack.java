import java.util.Scanner;
import java.util.Stack;

public class HistogramStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int arr[] = new int[c];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Container> stack = new Stack<>();
		
		
		stack.push(new Container(0, 0));
		for (int i = 0; i < arr.length; i++) {
			Container top = stack.peek();
			int topIdx = top.index;
			//top의 높이보다 현재 index의 높이가 크거나 같으면 push
			if(top.height <= arr[i]) {
				stack.push(new Container(i+1, arr[i]));
				
			//작으면
			}else {
				//
				//1. 해당 index보다 작은게 나올때까지 돌려줌
				stack.push(new Container(topIdx, arr[i]));
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						stack.push(new Container(j+1, arr[i]));
						break;
					}
				}
			}
		}
		stack.push(new Container(c+1, 0));
		
		Container top;
		while(!stack.isEmpty()) {
			top = stack.pop();
		}
		
	}
	
	
	
	static class Container{
		int index = 0;
		int height = 0;
		public Container(int index, int height) {
			super();
			this.index = index;
			this.height = height;
		}
		
	}

}
