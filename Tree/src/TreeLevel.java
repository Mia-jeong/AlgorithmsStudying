import java.util.LinkedList;
import java.util.Scanner;

//인접노드와 레벨을 담을 container
class Container{
	LinkedList<Integer> adjacents = new LinkedList<>();
	int level = 0;
	boolean visited = false;
	public Container() {
	}
}

public class TreeLevel {

	static Container [] tree;
	static int level = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		int root = sc.nextInt();

		tree= new Container[c];

		//null 관련 runtime error 을 대비하여 미리 다 선언해놓음. 
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new Container();
		}
		for (int i = 0; i < c-1; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();

			tree[node1].adjacents.add(node2);
			tree[node2].adjacents.add(node1);
		}

		tree[root].level = 0;
		
		findTreeLevel(root);
		
		System.out.println(level);
	}
	
	public static void findTreeLevel(int node) {
		

		Container treeNode = tree[node];
		//이미 방문했는지 확인
		if(treeNode.visited) {
			return;
		}else {
			//방문 표시
			treeNode.visited= true;
			for (int i = 0; i < treeNode.adjacents.size(); i++) {
				
				int n = treeNode.adjacents.get(i);
				Container temp  = tree[n];
				
				if(temp.visited) continue;
				
				int tempLv = treeNode.level+1;

				temp.level = tempLv;
				
				if(tempLv > level) level = tempLv;
				
				findTreeLevel(n);
			}
		}
	}

}
