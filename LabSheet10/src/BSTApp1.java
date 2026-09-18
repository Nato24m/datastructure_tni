
public class BSTApp1 {
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Minimum = " + tree.findMinimum(tree.getRoot()));
		System.out.println("Minimum = " + tree.findMaximum(tree.getRoot()));
		
		System.out.println();
		int target = 15;
		System.out.println("Is " + target + " in BST => " + tree.findSpecificData(target));
		
		System.out.println();
		int deleteNode = 60;
		tree.searchDeleteNode(deleteNode);
		System.out.println("Parent  = " + tree.getParent().data);
		System.out.println("DelNode = " + tree.getDeleteNode().data);
		
		System.out.println();
		tree.delete(deleteNode);
		tree.printTree(tree.getRoot(), 0);
		
	}
}
