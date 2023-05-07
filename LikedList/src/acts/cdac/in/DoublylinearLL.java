package acts.cdac.in;

import java.util.Scanner;

public class DoublylinearLL {
	  private static Scanner sc = new Scanner(System.in);

	 
	static class Node{
		
	  private int data;
	  private Node next;
	  private Node prev;
		public Node(int data) {
		
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		public Node() {
			
		}
		
	  
	}
	
	private Node head;
	
	
	public DoublylinearLL() {
		
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
	
	
	
	public boolean isEmpty() {
		return head == null;
	}
	public void Switch() {
		DoublylinearLL dl = new DoublylinearLL();
		int choice ;
		while((choice = dl.menu())!=0 ) {
			
			switch(choice) {
			 
			case 1:
				System.out.println("Enter Data for add At First Position : ");
				dl.addfirst(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Data for add At Last Position : ");
				dl.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter Data for add At Specific Position , Plz Enter Position : ");
				int pos  = sc.nextInt();
				System.out.println("Enter Data which you want to add : ");
				dl.addAtSpecificPosition(pos, sc.nextInt());
				break;
			case 4:
				try {
					dl.deleteFirst();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
					
				}
				break;
			case 5:dl.deletelast();
				break;
			case 6:dl.deleteAll();
				break;
				
			case 7:
				System.out.println("Enter Data for Delete At Specific Position , Plz Enter Position : ");
				dl.deleteAtSpecificPosition(sc.nextInt());
				break;
			case 8:dl.printAllForword();
				   dl.printAllReverse();
				break;

			}
		}
}

	private void printAllForword() {
		// TODO Auto-generated method stub
		Node trav = head ; 
		System.out.println("ForwordList : ");
		while(trav != null) {
			
			System.out.print(trav.data+"->");
			trav = trav.next;
		}
		System.out.println("null");
		
	}
	public void printAllReverse() {
		System.out.println("ReversedList : ");
		
		if(isEmpty())
			return;

		Node trav = head;
		while(trav.next!=null) {
			trav=trav.next;
		}
		
		while(trav != null) {
			System.out.print(trav.data+"->");
			trav = trav.prev;
		}
		System.out.println("null");

	}

	private void deleteAtSpecificPosition(int pos) {
		
		if(pos == 1) {
			deleteFirst();
		}
		if(pos  == size()) {
			deletelast();
		}
		else{
			 
			 Node trav = head;
			  for(int i=1;i<pos-1;i++) {
				   
				  trav= trav.next;
			  }
			  trav.next.next.prev = trav;
			  trav.next = trav.next.next;
			 
		}
		
	}
 
	private void deleteAll() {
		// TODO Auto-generated method stub
		head = null;
		
	}

	private void deletelast() {
		
		 if(isEmpty())
			 return;
		 else {
			  
			 Node trav  = head ;
			 
			 while(trav.next.next != null) {
				  
				  trav = trav.next;
			 }
			 trav.next = null;
		 }
	}

	private void deleteFirst() {
			
		 if(isEmpty()) {
			 return;
		 }
		 if(head.next == null) {
			 head = null;
		 }
		 else {
			  
			 
			  head = head.next;
			  head.prev= null;
			  
		 }
		 
		 
	}
	
	public int size() {
		 
		 int count  =0;
		 
		 Node trav = head ;
		 
		 while(trav != null) {
			  count++;
			 trav = trav.next;
		 }
		 return count;
		 
	}

	private void addAtSpecificPosition(int pos, int nextInt) {
			
		 Node nn = new Node(nextInt);
		  if(pos <=1 || pos == 0) {
			    addfirst(nextInt);
		  }
		  if(pos == size() ) {
			  addLast(nextInt);
		  }
		  if(pos == size()+1) {
			   
			  Node trav = head ;
			  
			  while(trav.next != null) {
				    
				  trav = trav.next;
			  }
			  nn.prev = trav;
			  trav.next = nn;
		  }
		  else {
			   Node trav = head;
			   for(int i=1;i<pos-1;i++) {
				   trav  = trav.next;
			   }
			   
			   nn.prev = trav;
			   nn.next = trav.next;
			   trav.next.prev = nn;
			   trav.next = nn;
			   
		  }
		
	}

	private void addLast(int nextInt) {
		
		Node trav = head;
		Node nn = new Node(nextInt);
		
		if(isEmpty()) {
			 
			 head = nn;
		}
		else {
			while(trav.next!=null) {
				 
				  trav = trav.next;
			}
			nn.prev = trav ;
			trav.next = nn;
		  
		}
		
		
	}

	private void addfirst(int nextInt) {
		Node nn = new Node(nextInt);

		if(isEmpty()) {
			head = nn;
		}
		else {
			head.prev = nn;
		    nn.next = head;
		    head = nn;
		    
		}
		
	}
	
	public static void main(String[] args) {
		DoublylinearLL d = new DoublylinearLL();
		d.Switch();
	}
}
