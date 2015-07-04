import java.util.Iterator;
import java.util.LinkedList;

public class App {
	public static void main(String args[]) {
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		// Lists implement the iterable interface, so we can do this
		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {
			String value = it.next();
			// iterator is now looking at the next item in the list
			System.out.println(value);

			if (value.equals("cat")) {
				// removes previous item
				it.remove();
			}
		}

		/*** To add items to a list while iterating through it, use ListIterator ***/

		System.out.println();

		// Modern way to iterate through, post java 5
		for (String animal : animals) {
			System.out.println(animal);

			// Cannot remove items from the list within a for-each loop
			// you get a ConcurrentModificationException

			// for-each actually uses the Iterator class
		}
	}
}
