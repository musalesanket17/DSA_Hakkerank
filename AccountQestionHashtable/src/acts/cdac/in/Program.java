package acts.cdac.in;
import java.util.Scanner;
public class Program {
	public static Scanner sc = new Scanner(System.in);
     static Customer c ;
	
	private static int menuList( ) {
		System.out.println();
		System.out.println("0.Exit.");
		System.out.println("1.Add Entry.");
		System.out.println("2.Find Customer.");
		System.out.println("3.Remove Entry.");
		System.out.println("4.Print Entries.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	
	private static void Switch(){
		 int choice ;
		while((choice = menuList())!=0) {
			
			switch(choice) {
			
			case 1:Account.CreateNewInstance();
				   Customer.CreateNewInstanceCustomer();
				   TestMap.addintoMap();
				break;
			case 2: System.out.println("Enter Accoutn Number : ");
			         c = TestMap.findCustomer(sc.nextInt());
			         printCustomer();
				break;
			case 3:System.out.println("Enter Accoutn Number : ");
	          		TestMap.removeCustomer(sc.nextInt()); 
	          		TestMap.printArr();
				break;
			case 4:TestMap.printMap();
				break;
			}
		}
		
	}
	public static  void printCustomer() {
		if(c!=null)
			System.out.println(c);
		else
			System.out.println("Customer Not Available!!");
	}
	public static void main(String[] args) {
		Switch();
	}
}
