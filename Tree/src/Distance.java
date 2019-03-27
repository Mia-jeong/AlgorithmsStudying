import java.util.Scanner;
import java.util.Vector;
public class Distance {

    public static Tree[] tree;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int nodeCount = sc.nextInt();
        int NodeA = sc.nextInt();
        int NodeB = sc.nextInt();
        tree = new Tree[nodeCount];
        
        for (int i = 0; i < nodeCount-1; i++) {
            
            int parent = sc.nextInt();
            int child = sc.nextInt();
            
            if(tree[parent] == null)
                tree[parent] = new Tree();
            
            if(tree[child] == null)
                tree[child] = new Tree();
            
            //자식 트리 부모에 부모 index 넣어주기
            tree[child].parent = parent;
            //자식 레벨 = 부모 트리 레벨 +1 
            tree[child].level = tree[parent].level+1;
        }
        
        Vector<Integer> a = findParent(NodeA);
        Vector<Integer> b = findParent(NodeB);
        int parent = findSameParent(a,b);
        int result = getDistance(NodeA, NodeB, parent);
        System.out.println(result);
    }
    
	public static Vector<Integer> findParent(int node){
		
		int idx = node;
		Vector<Integer> result = new Vector<>();
		//1, 3 처럼 3의 부모노드가 1일 경우를 대비해서 부모노드 리스트에 자신의 시작 노드를 같이 넣어
		result.addElement(node);
		
		
		while(idx != 0) {
			Tree temp = tree[idx];
			result.addElement(temp.parent);
			idx = temp.parent;

		}
		return result;
	}
	
	public static int findSameParent(Vector<Integer> a, Vector<Integer> b) {
		
		
		// == 쓰면 안되고 equal 써야함..pointer 때문..?
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if(a.get(i).equals(b.get(j))) {
					return a.get(i);
				}
			}
		}
		
		return 0;
	}
	
    public static int getDistance(int NodeA, int NodeB, int parent) {

        int distance = 0;
        int levelP = tree[parent].level;
        int levelA = tree[NodeA].level;
        int levelB = tree[NodeB].level;

        distance = (levelA - levelP) + (levelB - levelP);
        return distance;
    }

    
    public static class Tree{
        int parent = 0;
        int level = 1;
    }
}
