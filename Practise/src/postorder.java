import java.util.*;
import java.io.*;
import java.lang.*;


class Node2{
	
	int key;
	Node2 left;
	Node2 right;
	Node2(int k){
		
		key = k;
		left=right=null;
	}
}
public class postorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node2 root = new Node2(10);
		root.left = new Node2(20);
		root.right = new Node2(30);
		root.right.left = new Node2(40);
		root.right.right = new Node2(50);
		
		postorder(root);

	}

	private static void postorder(Node2 root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.key+ " ");
		   
		}
		
	}

}
