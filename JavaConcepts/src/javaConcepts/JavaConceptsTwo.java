package javaConcepts;

import java.util.*;

public class JavaConceptsTwo {
	
	public static void main(String args[]) {
		
		String[] sports = {"football", "cricket", "rugby", "golf"};
		for(String s: sports) {
			if(s.startsWith("f")) {
				System.out.println(s + " starts with f");
			}
		}
		
		for(String s: sports) {
			if(s.endsWith("l")) {
				System.out.println(s + " ends with l");
			}
		}
		
		String j = "johndoejohndoe";
		System.out.println(j.indexOf('j', 5));
		System.out.println(j.indexOf("john", 5));
		
		String f = "Football ";
		String c = "    Club    ";
		System.out.println(f + c);
		System.out.println(f.concat(c));
		System.out.println(f.replace("F", "B"));
		System.out.println(c.toUpperCase());
		System.out.println(c.trim());
		
		List<String> sportsList = new ArrayList<String>();
		for(String s: sports) {
			sportsList.add(s);
		}
		
		String[] moreSports = {"cricket", "rugby"};
		List<String> moreSportsList = new ArrayList<String>();
		for(String m: moreSports) {
			moreSportsList.add(m);
		}
		
		for(int i = 0; i < sportsList.size(); i++) {
			System.out.printf("%s ", sportsList.get(i));
		}
		
		editList(sportsList, moreSportsList);
		
		for(int i = 0; i < sportsList.size(); i++) {
			System.out.printf("%s ", sportsList.get(i));
		}
		
		System.out.println();
		
		String[] fruits = {"apples", "oranges", "bananas", "strawberries", "graPES"};
		List<String> fruitsList = new LinkedList<String>();
		for(String fr: fruits) {
			fruitsList.add(fr);
		}
		
		String[] moreFruits = {"pineapples", "strawberries", "grapes", "lemons"};
		List<String> moreFruitsList = new LinkedList<String>();
		for(String mFr: moreFruits) {
			moreFruitsList.add(mFr);
		}
		
		fruitsList.addAll(moreFruitsList);
		moreFruitsList = null;
		
		printList(fruitsList);
		removeStuff(fruitsList, 2, 5);
		printList(fruitsList);
		reverseList(fruitsList);
		
		String[] furnitures = {"sofas", "cupboards", "chairs", "tables"};
		LinkedList<String> furnituresList = new LinkedList<String>(Arrays.asList(furnitures));
		
		furnituresList.add("beds");
		furnituresList.addFirst("drawers");
		
		furnitures = furnituresList.toArray(new String[furnituresList.size()]);
		
		for(String fl: furnitures) {
			System.out.printf("%s ", fl);
		}
	}
	
	public static void editList(Collection<String> listOne, Collection<String> listTwo) {
		Iterator<String> it = listOne.iterator();
		while(it.hasNext()) {
			if(listTwo.contains(it.next())) {
				it.remove();
			}
		}
		System.out.println();
	}
	
	private static void printList(List<String> list) {
		for(String s: list) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
	
	private static void removeStuff(List<String> list, int from, int to) {
		list.subList(from, to).clear();
	}
	
	private static void reverseList(List<String> list) {
		ListIterator<String> li = list.listIterator(list.size());
		while(li.hasPrevious()) {
			System.out.printf("%s ", li.previous());
		}
		System.out.println();
 	}
}
