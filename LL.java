package Collection;

public class LL {

	 Node head;
     private int size;
     
     LL(){
    	 this.size=0;
     }
     
     
     
	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// add first

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	// add last

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}

		currNode.next = newNode;
	}

	// print

	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("Null");
	}
    
	
	// delete first
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	
	// delete last 
	
	public void deleteLast() {
		size--;
		if(head==null) {
			System.out.println("The list is empty");
			return;
		}
		
		if(head.next==null) {
			head = null;
			return;
			
		}
		
		Node secondLast = head;
		Node Lastnode = head.next;
		while(Lastnode.next != null) {
			Lastnode = Lastnode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {

		LL List = new LL();
		List.addFirst("a");
		List.addFirst("is");
		
		List.printList();
		
		List.addLast("List");
		List.printList();
		
		List.addFirst("this");
		List.printList();
		
		List.deleteFirst();
		List.printList();
		
		List.deleteLast();
		List.printList();
		
		System.out.println(List.getSize());
		
		List.addFirst("this");
		System.out.println(List.getSize());
		
		List.printList();
	}
}
