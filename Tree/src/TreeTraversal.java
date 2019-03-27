import java.util.Scanner;



public class TreeTraversal {

	static TreeNode treeNodes[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		treeNodes = new TreeNode[count];
		int arr[][] = new int[count][3];
		int start = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//store treeNode
		for (int i = 0; i < arr.length; i++) {
			int root = arr[i][0];
			int left = arr[i][1];
			int right = arr[i][2];
			if(treeNodes[root] == null) {
				treeNodes[root] = new TreeNode(left, right);
			}
		}
		
		preOrder(start);
		System.out.println();
		inOrder(start);
		System.out.println();
		postOrder(start);
	}
	
	static void preOrder(int n) {
		
		if(n== -1) return;
			
		TreeNode tr = treeNodes[n];
		System.out.print(n+ " ");
		preOrder(tr.left);
		preOrder(tr.right);
	}
	
	static void inOrder(int n) {
		
		if(n== -1) return;
			
		TreeNode tr = treeNodes[n];
		inOrder(tr.left);
		System.out.print(n+ " ");
		inOrder(tr.right);
	}
	
	static void postOrder(int n) {
		
		if(n== -1) return;
			
		TreeNode tr = treeNodes[n];
		postOrder(tr.left);
		postOrder(tr.right);
		System.out.print(n+ " ");
	}
	
	
	static class TreeNode{

		int left;
		int right;
		
		public TreeNode( int left, int right) {
			super();
			this.left = left;
			this.right = right;
		}
		
	}

}
