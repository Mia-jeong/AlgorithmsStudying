import java.util.Scanner;
import java.util.Vector;


public class SameParent {

	static int tree[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int nodeA = sc.nextInt();
		int nodeB = sc.nextInt();
		int arr[][] = new int[c-1][2];
		tree = new int[c];
		
		//트리입력
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i][0]; //parent;
			int b = arr[i][1]; //child;
			tree[b] = a;

		}
		
		Vector<Integer> a = findParent(nodeA);
		Vector<Integer> b = findParent(nodeB);
		
		int result = findSameParent(a, b);
		System.out.println(result);
		
	}
	
	public static Vector<Integer> findParent(int node){
		
		int idx = node;
		Vector<Integer> result = new Vector<>();
		//1, 3 처럼 3의 부모노드가 1일 경우를 대비해서 부모노드 리스트에 자신의 시작 노드를 같이 넣어
		result.addElement(node);
		while(idx != 0) {
			result.addElement(tree[idx]);
			idx = tree[idx];

		}
		return result;
	}
	
	public static int findSameParent(Vector<Integer> a, Vector<Integer> b) {
		
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if(a.get(i) == b.get(j)) {
					return a.get(i);
				}
			}
		}
		
		return 0;
	}

}
