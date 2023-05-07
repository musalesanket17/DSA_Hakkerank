package acts.cdac.in;
import java.util.*;
import java.util.Map.Entry;
public class TestMap {

	static Account account[] = new Account[5];
	static Customer customer[] = new Customer[5];
    static Map<Account,Customer> map = new Hashtable<>();
	
	public static void addaccountinArray(Account a) {

		if (a != null) {

			for (int i = 0; i < account.length; i++) {

				if (account[i] == null) {
					account[i] = a;
//					System.out.println(account[i]);
					break;
					

				}
			}
		}
	}
	public static void printArr() {
		
		for (int i = 0; i < account.length; i++) {
			
			System.out.println(account[i]);
			System.out.println(customer[i]);
		}
	}

	public static void addCustomerinArray(Customer c) {
//		System.out.println(c);
		if (c != null) {

			for (int i = 0; i < customer.length; i++) {

				if (customer[i] == null) {
					
					customer[i] = c;
//					System.out.println(customer[i]);

					break;
					
				}
			}
		}
	}
	
	public static void addintoMap() {
		
		 for(int i=0;i<account.length;i++) {
//			 if(map==null) {
			  map.put(account[i], customer[i]);
				  break;
//			 }
			 
		 }
	}
	public static void printMap() {
		if(map!=null) {
			 
			Set<Entry<Account, Customer>> elements = map.entrySet();
			
			for(Entry<Account, Customer> el : elements) {
				
				
				 System.out.print(el.getKey()+" "+el.getValue());
			}
		}
		
	}
	
	public static Customer findCustomer(int ac_no) {
		
		 Account a = new Account();
		 a.setAccount_no(ac_no);
		 
		 if(map.containsKey(a)) {
			 Customer co = map.get(a); 
			 return co;
		 }
		 return null;
	}
	public static void removeCustomer(int nextInt) {
         Account a = new Account();
         a.setAccount_no(nextInt);
         
         if(map!=null) {
        	 map.remove(a);
         }
         else {
        	  System.out.println("Customer Not Found");
         }
	}
	
}
