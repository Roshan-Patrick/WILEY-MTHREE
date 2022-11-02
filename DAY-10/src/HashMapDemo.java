import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> myMap = new HashMap<String,String>();
		
		Map<String,List<String>> library = new HashMap<String,List<String>>();
		library.put("Drama",Arrays.asList("Shakespeare","Hamilton","Venice"));
		System.out.println(library);
		
		
		myMap.put("101", "Messi");
		myMap.put("102", "Ronaldo");
		myMap.put("103", "Neymar");
		myMap.put("104", "Neymar");
		myMap.put("104", "Suarez");
		System.out.println(myMap);
		String name = myMap.get("104");
		System.out.println(name);
		
		Set<Entry<String,String>> mySet = myMap.entrySet();
		System.out.println(mySet);
		
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		
		
	}

}
