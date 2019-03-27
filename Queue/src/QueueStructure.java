import java.util.Scanner;

/*
 * when to use Queue
 * 상태의 의존관계가 없을때 
 * A 와 B가 서로 관련이 없지만 모두 하긴 해야 할때
 * Scheduling 병렬화 job queue
 * */
class Queue {
	
		int capacity = 0;
		int f = 0;
		int r = 0;
		int data[] = new int[1000];
		
		public void create(int n) {
			capacity = n;
			f = 0;
			r = 0;
		}
		
		public void push(int n) {
			if(r-f >= capacity || r >= capacity) {
				System.out.println("Overflow");
			}else {
				data[r++] = n;
			}
		}
		
		public void pop() {
			if(r-f <= 0) {
				System.out.println("Underflow");
			}else {
				data[f++] = 0;
			}
		}
		
		public int front() {
			if(r-f <= 0 || f < 0) {
				return -1;
			}else {
				return data[f];
			}
		}
		public int size() {
				return r-f;
		}
	
}
public class QueueStructure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[m][2];
		
		for (int i = 0; i < arr.length; i++) {
			int x = sc.nextInt();
			arr[i][0] = x;
			if(x == 1) {
				int y = sc.nextInt();  
				arr[i][1] = y;
			}
		}
		
		Queue queue = new Queue();
		queue.create(n);
		
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i][0];
			int b = arr[i][1];
			
			if( a == 1) {
				queue.push(b);
			}
			else if(a == 2) {
				queue.pop();
			}
			else {
				int top = queue.front();
				if(top >= 0) {
					System.out.println(top);
				}else {
					System.out.println("NULL");
				}
			}
		}
	}
}
