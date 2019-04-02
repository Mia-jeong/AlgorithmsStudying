import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;


/*
<input>
 5
6 9 5 7 4
<output>
0 0 2 2 4
  
 */
class Container{
	int index = 0;
	int data = 0;
	public Container(int index, int data) {
		super();
		this.index = index;
		this.data = data;
	}
}
public class Top {
	static Vector<Container> array = new Vector<>(1);
	static Stack<Container> s = new Stack<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < count; i++) {
			int data = sc.nextInt();
			array.addElement(new Container(i+1, data));
		}
		
		
		for (int i = 0; i < array.size(); i++) {
			
			int current = array.get(i).data;
			
			//stack 이 empty가 아니고 top 이 current 보다 작은 것들은 다 pop 한다
			while((!s.isEmpty()) && (s.peek().data <= current)) {
				s.pop();
			}
			
			//stack 이 empty 면 0 (수신하는곳이 x) 있으면 해당 인덱스가 수신 탑 
			int result = s.isEmpty() ? 0 : s.peek().index;
			sb.append(result+ " ");
			
			s.push(array.get(i));
		}
		
		System.out.println(sb.toString());

	}
	
	

}
