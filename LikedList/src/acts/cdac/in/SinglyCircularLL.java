package acts.cdac.in;

import java.util.Scanner;

public class SinglyCircularLL {
	  private static Scanner sc = new Scanner(System.in);

	static class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			
			this.data = data;
			this.next = null;
		}
		public Node() {};
	}
	
	private Node head;
	
	
	 
	public SinglyCircularLL() {
		
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
		SinglyCircularLL sl = new SinglyCircularLL();
		int choice ;
		while((choice = sl.menu())!=0 ) {
			
			switch(choice) {
			 
			case 1:
				System.out.println("Enter Data for add At First Position : ");
				sl.addfirst(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Data for add At Last Position : ");
				sl.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter Data for add At Specific Position , Plz Enter Position : ");
				int pos  = sc.nextInt();
				System.out.println("Enter Data which you want to add : ");
				sl.addAtSpecificPosition(pos, sc.nextInt());
				break;
			case 4:
				try {
					sl.deleteFirst();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
					
				}
				break;
			case 5:sl.deletelast();
				break;
			case 6:sl.deleteAll();
				break;
				
			case 7:
				System.out.println("Enter Data for Delete At Specific Position , Plz Enter Position : ");
				sl.deleteAtSpecificPosition(sc.nextInt());
				break;
			case 8:sl.printAll();
				break;

			}
		}
	  
}

	private void printAll() {
		if(isEmpty())
			return ;
		System.out.println("List: ");
		Node trav = head ;
		do {
			System.out.print(trav.data+"->");
			trav=trav.next;
		}while(trav != head);
		System.out.println("null !!");
	}

	public int size() {
		int count=0;
		Node trav = head;
		do {
			
			trav = trav.next;
			count++;
		}while(trav != head);
		return count;
	}
	private void deleteAtSpecificPosition(int position) {
			 
		if(position == 1) {
			
			Node trav = head;
			
			while(trav.next != head) {
				 
				trav = trav.next;
			}
			head = head.next;
			trav.next = head;
  		}
		if(position == size() ) {
			deletelast();
		}
		else if(position != 1 || position != size()){
			 Node trav = head;
			for(int i=1;i<=position-2;i++) {
				
				trav = trav.next;
			}
			trav.next  = trav.next.next;
		}
		
	}

	private void deleteAll() {
		
		 head = null;
	}

	private void deletelast() {
       
		Node trav = head ;
		
		while(trav.next.next != head) {
			
			trav=trav.next;
		}
		trav.next = head;
		
	}

	
	private void deleteFirst() {
		
		 Node trav = head;
		 if(isEmpty()) {
			 return;
		 }
		 else {
			 
			 while(trav.next != head) {
				  
				 trav=trav.next;
			 }
			 head = head.next;
			 trav.next =head;
		 }
	}

	private void addAtSpecificPosition(int pos, int nextInt) {
			
		  Node nn = new Node(nextInt);
		   if(pos == 0 || pos <=1) {
			   addfirst(nextInt);
		   }
		   if(pos == size()) {
			    addLast(nextInt);
		   }
		   else {
			    
			   Node trav = head;
			   
			   for(int i=1;i<=pos-2;i++) {
				    
				   trav = trav.next;
			   }
			   
			   nn.next = trav.next;
			   trav.next = nn;
			  
		   }
	}
	
	public boolean isEmpty() {
		 
		return head == null;
	}

	private void addLast(int nextInt) {
          
		Node nn = new Node(nextInt);
		Node trav = head;
		
		if(isEmpty()) {
			
			head = nn;
			nn.next = head;
		}
		else {
		while(trav.next != head) {
			trav = trav.next;
		}
		nn.next = head;
		trav.next = nn;
		}
	}

	private void addfirst(int nextInt) {
		
		Node nn = new Node(nextInt);
		Node trav = head;
		if(head == null) {
			head = nn;
			nn.next = head;
		}
		else {
			
			while(trav.next != head) {
				  
				 trav= trav.next;
			}
			nn.next = head;
			head = nn;
			trav.next = head;
			
		}
		
	}
	public static void main(String[] args) {
		SinglyCircularLL s = new SinglyCircularLL();
		s.Switch();
	}
}
