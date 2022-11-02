package com.collection;
import java.util.*;

public class NestedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Map<String,String>> employeeMap = new HashMap<>();
		Map<String,String> addressMap = new HashMap<>();
		 addressMap.put("Permanent", "Florida");
		 addressMap.put("Postal", "Canada");
		 
		 employeeMap.put("Messi", addressMap);
		 System.out.println(employeeMap);
		 
		 employeeMap.get("Messi").put("HideOut","UAE");
		 System.out.println(employeeMap);
		 
		 employeeMap.get("Messi").remove("HideOut","UAE");
		 System.out.println(employeeMap);
		 
		 //Iterate OuterMap
		 
		 for(Map.Entry<String,Map<String,String>> empMap:employeeMap.entrySet()) {
			 Map<String,String> addMap = empMap.getValue(); //getValue returns Map, because the outer map contains the map as value
			 System.out.println(addMap);
			 System.out.println(empMap.getKey());
			 
			 
			 //Iterate InnerMap
			 for(Map.Entry<String,String> addressSet:addMap.entrySet())
				 System.out.println(addressSet.getKey()+ " :: "+ addressSet.getValue());
		 }
			 
		 
	}

}
