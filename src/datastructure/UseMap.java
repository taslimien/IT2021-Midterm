package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 */

		List<String> applePhone = new ArrayList<>();
				applePhone.add("iPhone 12");
				applePhone.add("iPhone 12 Pro");
				applePhone.add("iPhone 12 ProMax");

		Map<String, List<String>> phone = new HashMap<>();
		phone.put("Apple IPhone Latest Model: ",applePhone);

		for (Map.Entry<String, List<String>> entry:phone.entrySet()){
			System.out.println(entry.getKey() +  entry.getValue());

		}






	}

}
