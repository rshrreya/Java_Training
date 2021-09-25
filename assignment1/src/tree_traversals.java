
class tree_traversals{
	
	static class Node {
		int i;
		Node left, right;

		public Node(int n)
		{
			i = n;
			left = right = null;
		}
	}
	static Node root;

	tree_traversals() 
	{
		root = null;
		
	}	
	void inorder(Node node)
	{
		if (node == null)
			return;
		inorder(node.left);
		System.out.println(node.i + " ");
		inorder(node.right);
	}

	
	void preorder(Node node)
	{
		if (node == null)
			return;
		System.out.println(node.i + " ");
		preorder(node.left);
		preorder(node.right);
	}
	void postorder(Node node)
	{
		if (node == null)
			return;
		postorder(node.left);

		postorder(node.right);
		System.out.println(node.i + " ");
	}


	
	public static void main(String[] args)
	{
		tree_traversals t = new tree_traversals();
		t.root = new Node(1);
		t.root.left = new Node(2);
		t.root.right = new Node(3);
		t.root.left.left = new Node(4);
		t.root.left.right = new Node(5);
		t.root.left.left.left = new Node(6);
		t.root.left.left.right = new Node(7);
		t.root.left.right.left = new Node(8);
		t.root.left.right.right = new Node(9);

		System.out.println("Preorder traversal :");
		t.preorder(root);

		System.out.println("\nInorder traversal:");
	    t.inorder(root);

		System.out.println("\nPostorder traversal :");
		t.postorder(root);
	}
}

