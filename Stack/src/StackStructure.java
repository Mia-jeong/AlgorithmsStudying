import java.util.Scanner;


 
/*
 *when to use stack
 *save the Status
 *remember the footprint ( in maze) 
 *발자취를 기억하는 용도 
 *"상태"의 의존관계가 생길 때
 *A라는 일을 마치기 위해 B라는 일을 먼저 끝내야 할때 
 *ex) computer
 *execute code. which data structure we need to execute the code? call stack
 *
 */
class Stack {
	
	int data[] = new int[1000000];
	int len = 0;
	int capacity = 0;
	
	public void create(int n) {
		this.capacity = n;
	}
	
	public void push(int n) {
		
		if(len >= capacity) 
			System.out.println("Overflow");
		else 
			data[len++] = n;
	}
	
	public void pop(){
		
		if(len <= 0) 
			System.out.println("Underflow");
		else 
			data[--len] = 0;
	}
	
	public int top() {
		if( len <= 0) return -1;
		else return data[len-1];
	}
	
	public int size() {
		return len;
	}
}
public class StackStructure {

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
		
		Stack s = new Stack();
		s.create(n);
		
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i][0];
			int b = arr[i][1];
			
			if( a == 1) {
				s.push(b);
			}
			else if(a == 2) {
				s.pop();
			}
			else {
				int top = s.top();
				if(top >= 0) {
					System.out.println(top);
				}else {
					System.out.println("NULL");
				}
			}
		}
		
	}

}
