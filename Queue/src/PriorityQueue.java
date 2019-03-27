

class PQueue{
	int max =100;
	int data[] = new int [max];
	int len = 0;
	
	public void push (int n) {
		data[len++] = n;
	}
	
	public void pop() {
		//1. 우선 순위가 가장 높은 원소를 찾는다.
		//2. 그 원소를 제거하고, 뒤의 원소를 앞으로 당긴다.
		
		int myMax = -98712323, myMaxIdx = -1;
		
		//1.
		for (int i = 0; i < len; i++) {
			if(data[i] > myMax) {
				myMax = data[i];
				myMaxIdx = i;
			}
		}
		
		//2.
		for (int i = myMaxIdx; i < len; i++) {
			data[i] = data[i+1];
		}
		
		len--;
	}
	
	public int top() {
		int myMax = -98712323;
		for (int i = 0; i < len; i++) {
			if(data[i] > myMax) {
				myMax = data[i];
			}
		}
		return myMax;
	}
}
public class PriorityQueue {

	public static void main(String[] args) {
		PQueue myPQ = new PQueue();
		
		myPQ.push(1);
		myPQ.push(8);
		myPQ.push(3);
		myPQ.push(5);
		
		System.out.println(myPQ.top());
		myPQ.pop();

		System.out.println(myPQ.top());
		myPQ.pop();

		System.out.println(myPQ.top());
		myPQ.pop();

		System.out.println(myPQ.top());
		myPQ.pop();
	}

}
