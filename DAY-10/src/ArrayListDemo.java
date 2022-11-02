import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(22);
		numbers.add(32);
		numbers.add(2, 28);
		
		System.out.println(numbers);
		
		ArrayList <Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(12);
		numbers1.add(12);
		numbers1.add(12);
		
//		numbers.addAll(numbers1);
//		System.out.println(numbers);
//		System.out.println(numbers.get(4));
//		System.out.println(numbers);
//		numbers.remove(2);
//		numbers.remove(new Integer(12));
//		System.out.println(numbers);
		
		
//		for(int i=0;i<numbers.size();i++) {
//			System.out.print(numbers.get(i)+" ");
//		}
//		
//		for(int number:numbers) {
//			System.out.println(number);
//		}
		
		Iterator<Integer> numIterator = numbers.iterator();
		while(numIterator.hasNext()) {
			int data = numIterator.next().intValue();
			System.out.println(data);
			numIterator.remove();
		}
		
		System.out.println(numbers);
		
		
		
		
		
	}	

}
