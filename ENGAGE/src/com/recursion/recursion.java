package com.recursion;

public class recursion {
	public int[] bubbleSort(int[] list, int n) {
		if(n==1)
			return list;
		int temp;
		for(int i=0; i<n-1;i++){
			if(list[i+1]<list[i]) {
				temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp;
			}
			
		}
		return bubbleSort(list, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			recursion obj = new recursion();
			int[] l= {3,6,1,2,3};
			int[] l1 = obj.bubbleSort(l,l.length);
			for(int x:l1)
				System.out.println(x);
			
		

	}

}
