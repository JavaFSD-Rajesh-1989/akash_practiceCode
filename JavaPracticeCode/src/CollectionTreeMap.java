import java.util.NavigableSet;
import java.util.TreeMap;

public class CollectionTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "tree1");
		map.put(2, "tree2");
		map.put(3, "tree3");
		map.put(4, "tree4");
		
		TreeMap<Integer, String> map2 = new TreeMap<>(map);
		System.out.println("1.output: "+map2);
		System.out.println("2. Keys: "+map2.keySet());
		
		TreeMap<Integer, String> map3 = new TreeMap<>(map2);
		System.out.println("3.Sorted: "+map3);
		System.out.println("3.Descending:" +map3.descendingMap());
		System.out.println("4.First entry: "+map3.firstEntry());
		System.out.println("4.Last Entry:" +map3.lastEntry());
		System.out.println("5.First key:" +map3.firstKey());
		System.out.println("5.Last key: "+ map3.lastKey());
		System.out.println("7.Head Map:" +map3.headMap(2));
		System.out.println("8.Head mAp2: "+map3.headMap(3, false));
		System.out.println("Tail map:" + map3.tailMap(3));
		System.out.println("10. Lower map:"+map3.lowerEntry(3));
		System.out.println("11. higher: "+ map3.higherEntry(2));
		System.out.println("13. submap:" +map3.subMap(1, false, 3, true));
		System.out.println("14. submap: " +map3.subMap(2, 4));
		
		NavigableSet<Integer> set1 = map3.navigableKeySet();
		System.out.println("NavigableSet: "+set1);
	}

}
