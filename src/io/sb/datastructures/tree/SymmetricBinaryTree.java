
// Algorithm to check if a tree is a mirror
package io.sb.datastructures.tree;


class Node {
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class SymmetricBinaryTree {
   Node root;
   
   
   public boolean isSymmetric(Node node1, Node node2) {
	   if(node1 == null && node2 == null) 	  
	   return true;
	// For two trees to be mirror images, the following three 
       // conditions must be true 
       // 1 - Their root node's key must be same 
       // 2 - left subtree of left tree and right subtree 
       //      of right tree have to be mirror images 
       // 3 - right subtree of left tree and left subtree 
       //      of right tree have to be mirror images 
	   if(node1 != null && node2 != null && node1.data == node2.data)
		   return (isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left));	   
	   
	   return false;
   }
	
	public static void main(String[] args) {
		
		SymmetricBinaryTree sbt = new SymmetricBinaryTree();
		sbt.root = new Node(1);
		sbt.root.left = new Node(2);
		sbt.root.right = new Node(2);
		sbt.root.left.left = new Node(3);
		sbt.root.left.right = new Node(4);
		sbt.root.right.left = new Node(4);
		sbt.root.right.right = new Node(3);	
		
		if(sbt.isSymmetric(sbt.root, sbt.root)) {
			System.out.println("Binary Tree is Symmetric");
		} else {
			System.out.println("Binary Tree is not Symmetric");
		}		

	}

}
