import java.util.*;
import java.io.*;
import java.lang.*;


class Node1{
	
	int key;
	Node1 left;
	Node1 right;
	Node1(int k){
		
		key = k;
		left=right=null;
	}
}
public class preorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 root = new Node1(10);
		root.left = new Node1(20);
		root.right = new Node1(30);
		root.right.left = new Node1(40);
		root.right.right = new Node1(50);
		
		preorder(root);

	}

	private static void preorder(Node1 root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			System.out.println(root.key+ " ");
		    preorder(root.left);
			preorder(root.right);
		}
		
	}

}
