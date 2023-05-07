package acts.cdac.in;

import java.util.Scanner;

public class DoublyCLL {
	  private static Scanner sc = new Scanner(System.in);

	 static class Node{
		 private int data;
		 private Node prev;
		 private Node next;
		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		public Node() {};
		 
	 }
	 
	 private Node head ;
	 
 
	 public DoublyCLL() {
		this.head = null;
	}
	 
	 public int  menu() {
			System.out.println();
			System.out.println("0.EXIT");
			System.out.println("1.ADDFIRST");
			System.out.println("2.ADDLAST");
			System.out.println("3.ADDATSPECIFICPOSITION");
			System.out.println("4.DELETFIRST");
			System.out.println("5.DELETELAST");
			System.out.println("6.DELETALL");
			System.out.println("7.DELETATSPECIFICPOSITION");
			System.out.println("8.PRINTALL");
			System.out.print("Enter Choice : ");
			return sc.nextInt();
		}
	 public void Switch() {
		 DoublyCLL dcll = new DoublyCLL();
			int choice ;
			while((choice = dcll.menu())!=0 ) {
				
				switch(choice) {
				 
				case 1:
					System.out.println("Enter Data for add At First Position : ");
					dcll.addfirst(sc.nextInt());
					break;
				case 2:
					System.out.println("Enter Data for add At Last Position : ");
					dcll.addLast(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter Data for add At Specific Position , Plz Enter Position : ");
					int pos  = sc.nextInt();
					System.out.println("Enter Data which you want to add : ");
					dcll.addAtSpecificPosition(pos, sc.nextInt());
					break;
				case 4:
					try {
						dcll.deleteFirst();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.err.println(e.getMessage());
						
					}
					break;
				case 5:dcll.deletelast();
					break;
				case 6:dcll.deleteAll();
					break;
					
				case 7:
					System.out.println("Enter Data for Delete At Specific Position , Plz Enter Position : ");
					dcll.deleteAtSpecificPosition(sc.nextInt());
					break;
				case 8:dcll.printAllForward();
				 	   dcll.printAllReverse();
					break;

				}
			}
	 }


	private void printAllForward() {
		if(isEmpty())
			return;
		else {
         System.out.println("Forward List : ");
		Node trav = head ;
		do {
			 System.out.print(trav.data+"->");
			 trav = trav.next;
		}while(trav!=head);
		System.out.println("null");
		}
	}
	
	private void printAllReverse() {
		if(isEmpty())
			return;
		else {
        System.out.println("Reverse List : ");

		Node trav = head.prev;
		do {
			System.out.print(trav.data+"->");
			trav = trav.prev;
		}while(trav!=head.prev);
		System.out.println("null");
		}
	}

	private void deleteAtSpecificPosition(int pos) {
		
		if(pos > size()) {
			 System.out.println("Invalid position!!");
		 }
		 if(pos == 1 ) {
			  deleteFirst();
		 }
		 if(pos == size()) {
			 deletelast();
		 }
		 else {
			   
			 Node trav  = head ;
			 
			 for(int i=1;i<pos-1;i++) {
				    trav = trav.next;
			 }
			 trav.next = trav.next.next;
			 trav.next.next.prev = trav;
		 }
		
		
	}

	private void deleteAll() {
		
		 head.prev = null;
		 head = null;
	}

	private void deletelast() {
		
		 if(isEmpty()) {
			 return;
		 }
		 if(head.next == head) {
			 head = null;
		 }
		 else {
			  
			 Node tail = head.prev;
			 tail.prev.next = tail.next;
			 head.prev = tail.prev;
			 
		 }
	}

	private void deleteFirst() {
		
		if(isEmpty()) {
			return ;
		}
		if(head.next == head){
			head = null;
		}
		else {
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head = head.next;
		}
		
		
	}
	
	public int size() {
		   int count =  0;
		   Node trav = head;
		   while(trav.next != head) {
			   count++;
			   trav = trav.next;
		   }
		return count;
	}

	private void addAtSpecificPosition(int pos, int nextInt) {
		Node nn = new Node(nextInt);

		 if(pos == 1) {
			 addfirst(nextInt);
		 }
		 if(pos == size()) {
			 addLast(nextInt);
		 }
		 if(pos >=size()) {
			  
			   Node tail  = head.prev;
			   nn.prev = tail;
			   nn.next = tail.next;
			   tail.next = nn;
			   head.prev = nn;
		 }
		 else {
			 Node trav = head ;
			 
			 for( int i=1;i<pos-1;i++ ) {
				    
				  trav= trav.next;
			 }
			  nn.prev = trav ;
			  nn.next = trav.next;
			  trav.next.prev = nn;
			  trav.next = nn;
			 
		 }
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	private void addLast(int nextInt) {
		
		Node nn = new Node(nextInt);
		
		if(isEmpty()) {
			head = nn;
			nn.prev = head;
			nn.next = head;
		}
		else {
			 
			Node tail = head.prev;
			nn.prev = tail;
			nn.next = head;
			tail.next = nn;
			head.prev = nn;
			
		}
		
	}

	private void addfirst(int nextInt) {
		Node nn = new Node(nextInt);

		if(isEmpty()) {
			head = nn;
			nn.prev = head;
			nn.next = head;
		}
		else {
			Node tail = head.prev;
			nn.prev = tail;
			nn.next = head;
			tail.next = nn;
			head.prev = nn;
			head=nn;
		}
		
	}

	public static void main(String[] args) {
		DoublyCLL dc = new DoublyCLL();
		dc.Switch();
	}
}
