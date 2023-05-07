package acts.cdac.in;
import java.util.Scanner;
public class LinearQueue {
    

	 private int arr[] ;
	 int rear = -1;
	 int front = -1;

	public LinearQueue(int size) {
		
		this.arr = new int[size];
	}
	
	public  void  printAll() {
		 
		for(int i=front;i<arr.length-1;i++) {
			 if(arr[i] == 0) {
				 continue;
			 }
			 else {
					System.out.print(arr[i]+"->");

			 }
		}
		System.err.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		LinearQueue l = new LinearQueue(sc.nextInt());
		l.addData(1);
		l.addData(2);
//		l.addData(3);
//		l.addData(4);
        l.printAll();
		l.deleteData();
        l.peek();

		l.deleteData();
		l.deleteData();
        l.printAll();

	}


  private void peek() {
	   
	   System.out.println(arr[front]+" Peek Element");
	}

public boolean isEmpty() {
	  return rear == -1 || rear < front;
  }


	private void deleteData() {
		 if(isEmpty()) {
			 System.out.println("Queue is Empty!!");
		 }
		 else {
			 
				 front++;
			 
			 
//			  System.out.println(arr[front]+ "is Deleted !");
		 }
	}
   
	public boolean isFull() {
		return rear == -1;
	}


	private void addData(int i) {
		
		 if(front == -1) {
			 front++;
		 }
		 if(rear == arr.length-1) {
			 System.out.println("Queue is Full !!");
		 }
		 else {
			  
			  arr[++rear] = i;
		 }
	}
	 
	 
}
