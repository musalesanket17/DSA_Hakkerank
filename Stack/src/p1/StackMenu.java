package p1;
import java.util.Scanner;
	
class Stack{
		private int[] arr;
		private int top;
		Scanner sc=new Scanner(System.in);
		
		public Stack(int size)
		{
			this.arr=new int[size];
			this.top=-1;
			
		}
		public Stack(){}
		
		public boolean isEmpty()
		{
			return top==-1;
		}
		public boolean isFull()
		{
			return top==arr.length-1;
		}
		public void push(int value)
		{
			if(isFull())
				throw new RuntimeException("Stack is full");
			
			top++;
			arr[top]=value;
		}
		public void pop()
		{
			if(isEmpty())
				throw new RuntimeException("Stack is Empty");
			
			top--;
		}
		public int peek()
		{
			if(isEmpty())
				throw new RuntimeException("Stack is Empty");
			
			return arr[top];
		}
		
		public static int menu()
		{   
		Scanner sc=new Scanner(System.in);
			System.out.println("0. EXIT");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
			System.out.println("Enter Choice");
			
			return sc.nextInt();
		}
		public void Switch() {
		    Stack s=new Stack();

			 int choice;
			   while((choice=Stack.menu())!=0)
			   {
				   switch(choice)
				   {
					   case 1:
					   try{
						   if(s.isFull())
					       throw new RuntimeException("Stack is full");
					   System.out.println("Enter value to add in the stack");
					   int num=sc.nextInt();  
					   s.push(num);
					   }catch(Exception e)
					   {
						   System.out.println(e.getMessage());
					   }
						break;
						
						case 2:
					   try{
						   int num=s.peek();
						   s.pop();
						   System.out.println("Popped :"+num); 
					   }catch(Exception e)
					   {
						   System.out.println(e.getMessage());
					   }
						break;
						
						case 3:
					   try{
						   int num=s.peek();
						   System.out.println("Peek :"+num); 
					   }catch(Exception e)
					   {
						   System.out.println(e.getMessage());
					   }
						break;
				   }
					
			   }
		}
	}


public class StackMenu{
	 
	public static void main(String[] args) {
		 Stack s1=new Stack(5);
		    s1.Switch();
	}
}
		
	  
	   

	  
	



