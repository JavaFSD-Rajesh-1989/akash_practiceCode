import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		System.out.println("List: " + list);
		System.out.println("List size: " + list.size());
		System.out.println("Shallow copy: " + list.clone());
		System.out.println("Sort: ");
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Sub List: " + list.subList(1, 3));

		ArrayList<Integer> list2 = new ArrayList<>(list);
		System.out.println("New List: " + list2);

		System.out.println("First element: " + list.get(0));
		System.out.println("Get specified index: " + list.get(3));

		list.add(1, 10);
		System.out.println("Insert element in index: " + list);
		System.out.println("Index of first element: " + list.indexOf(2));
		System.out.println("Last component: " + (list.size() - 1));
		System.out.println("last occurance: " + list.lastIndexOf(2));
		list.remove(2);
		System.out.println("Remove: " + list);

		list.removeAll(list2);

	}
}
