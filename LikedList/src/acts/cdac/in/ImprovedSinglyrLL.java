package acts.cdac.in;

public class ImprovedSinglyrLL {

	
	static class Node{
		 
		private int data;
		private Node next;
		public Node(int data) {
			
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	private Node head ;
	private Node tail;
	public ImprovedSinglyrLL(Node head, Node tail) {
		
		this.head = null;
		this.tail = null;
	}
	public ImprovedSinglyrLL() {};
	
	public void addAtLast(int data) {
		 
		Node nn  = new Node(data);
		if(head == null) {
			head = nn;
			tail= nn;
		}
		else {
			tail.next = nn;
			tail = nn;
		}
		
	}

	public void addAtFirst(int data) {
		
		 Node nn = new Node(data);
		 if(head == null)
			 tail = nn;
		 
		 nn.next = head;
		 head = nn;
		 
		 
	}
	public void printAll() {
		
		 Node trav = head;
		 
		 while(trav != null) {
			  
			 System.out.println(trav.data);
			 trav = trav.next;
		 }
	}
	
	public void deleteFirst() {
		
		if(head == null)
			System.out.println("List Already Empty!!");
		if(head.next == null) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
		}
	}
	public void deleteLast() {
		 
		Node trav = head;
		
		while(trav.next.next !=  null) {
			 
			trav = trav.next;
		}
		trav.next = null;
		tail= trav;
	}
	
	public int getSize() {
		int count=0;
		
		Node trav = head;
		if(head == null) {
			 count=0;
		}
		else {
			
			while(trav != null) {
				count++;
				trav = trav.next;
				
			}
		}
//		System.out.println(count);
		return count;
		
	}
	
	public void addAtSpecificposition(int position,int data) {
		 
		 Node nn = new Node(data);
		 Node trav = head;
		 
		 for(int i=1;i<=position-2;i++) {
			  
			   trav=trav.next;
		 }
		 if(position == 1)
			 addAtFirst(data);
		 else if(position == getSize()) {
			 
			  tail.next = nn;
			  tail = nn;
		 }
		 else {
		   nn.next = trav.next;
		   trav.next = nn;
		 }
	}
	
	
	public static void main(String[] args) {
		 
		ImprovedSinglyrLL scll = new ImprovedSinglyrLL();
		
		scll.addAtFirst(2);
		scll.addAtFirst(3);
		scll.addAtFirst(4);
//		scll.printAll();
//		scll.addAtLast(10);
//		scll.addAtLast(20);
//		scll.addAtLast(30);
//		scll.printAll();
		
		System.out.println("***********");
//		scll.deleteFirst();
//		scll.deleteFirst();
//		
//		scll.deleteLast();
//		scll.deleteLast();
//		scll.addAtLast(1000);
		scll.addAtSpecificposition(2, 2000);
		scll.addAtSpecificposition(3, 3000);
//		scll.addAtSpecificposition(7, 5000);
     	scll.addAtLast(1000);

		scll.printAll();
        
//		System.out.println(scll.getSize());

		
		


		
	}
	
}
