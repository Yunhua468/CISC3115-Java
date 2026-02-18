import java.util.ArrayList;

class TreeNode {
	int element;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int e) {
		this.element = e;
	}
}

public class BST {
	TreeNode root;
	// Static shared ArrayList across all BST instances
	static ArrayList<Integer> sharedlist = new ArrayList<>();
	
	public BST(TreeNode root) {
		this.root = root;
	}
	
	public void inorder(TreeNode node, int depth) {
		if (node==null) return;
		
		System.out.println("  ".repeat(depth) + "Go left from " + node.element);
		inorder(node.left, depth+1);             // visit left subtree
		sharedlist.add(node.element);            // visit current node
		inorder(node.right, depth+1);            // visit right subtree
	}
	
	public void preorder(TreeNode node) {
        if (node == null) return;

        sharedlist.add(node.element);   // visit current node
        preorder(node.left);            // visit left subtree
        preorder(node.right);           // visit right subtree
    }
	
	public void postorder(TreeNode node) {
        if (node == null) return;

        postorder(node.left);           // visit left subtree
        postorder(node.right);          // visit right subtree
        sharedlist.add(node.element);   // visit current node
    }
	
	public void printTraversal() {
		System.out.println(sharedlist);
	}
	
	public static void main(String[] args) {
        // Create BST
        TreeNode root = new TreeNode(60);
        root.left = new TreeNode(55);
        root.right = new TreeNode(100);
        root.left.left = new TreeNode(45);
        root.left.right = new TreeNode(57);
        root.right.left = new TreeNode(67);
        root.right.right = new TreeNode(107);

        BST bst = new BST(root);

        // In-order
        sharedlist.clear();
        bst.inorder(bst.root, 0);
        System.out.print("Inorder: ");
        bst.printTraversal();

        // Pre-order
        sharedlist.clear();
        bst.preorder(bst.root);
        System.out.print("Preorder: ");
        bst.printTraversal();

        // Post-order
        sharedlist.clear();
        bst.postorder(bst.root);
        System.out.print("Postorder: ");
        bst.printTraversal();
    }
	
}



