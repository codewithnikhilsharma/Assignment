package Collection;

import java.util.*;

public class LinkListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String>List = new LinkedList<String>();
		
		List.addFirst("a");
		List.addFirst("is");
		System.out.println(List);
		
		List.addFirst("this");
		List.addLast("List");
		System.out.println(List);
		
		System.out.println(List.size());
		
		for(int i=0; i<List.size(); i++) {
			System.out.print(List.get(i)+ " -> ");
		}		
		System.out.println("null");
		
//		List.removeFirst();
//		System.out.println(List);
//		
//		List.removeLast();
//		System.out.println(List);
		
		List.remove(3);
		System.out.println(List);
	}
}
