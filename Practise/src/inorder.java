import java.util.*;
import java.io.*;
import java.lang.*;


class Node{
	
	int key;
	Node left;
	Node right;
	Node(int k){
		
		key = k;
		left=right=null;
	}
}
public class inorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		inorder(root);

	}

	private static void inorder(Node root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.key+ " ");
			inorder(root.right);
		}
		
	}

}
