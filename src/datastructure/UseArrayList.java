package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<Integer> list = new ArrayList<Integer>();

		list.add(14);
		list.add(25);
		list.add(18);
		list.add(16);
		list.add(24);
		list.add(26);
		list.add(31);
		list.add(100);

		list.remove(7);

		Iterator<Integer> it = list.listIterator();

		while (it.hasNext()){
			System.out.println(it.next());
		}


		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));

		}
	

	}

}
