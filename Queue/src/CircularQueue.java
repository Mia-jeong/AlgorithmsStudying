import java.util.Scanner;

class CQueue {
	int max = 1000;
	int capacity = 0;
	int f,r;
	int numElement;
	int data[] = new int[max];
	
	public void create(int n) {
		capacity = n;
		f = 0;
		r = 0;
		numElement= 0;
	}
	
	public void push(int n) {
		if(numElement >= capacity) {
			System.out.println("Overflow");
		}else {
			data[r] = n;
			r = (r+1) % capacity;
			numElement++;
		}
	}
	
	public void pop() {
		if(numElement <= 0) {
			System.out.println("Underflow");
		}else {
			data[f] = 0;
			f = (f+1) % capacity;
			numElement--;
		}
	}
	
	public int front() {
		if(numElement <= 0 ) {
			return -1;
		}else {
			return data[f];
		}
	}
	public int size() {
			return numElement;
	}
}
public class CircularQueue {

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
		
		CQueue queue = new CQueue();
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
