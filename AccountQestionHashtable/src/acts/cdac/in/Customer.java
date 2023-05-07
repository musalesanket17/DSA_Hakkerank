package acts.cdac.in;

import java.util.Scanner;

public class Customer {

	public static Scanner sc = new Scanner(System.in);

		private String name;
		private String email;
		private String contactNumber;
		public Customer() {
			// TODO Auto-generated constructor stub
		}
		public Customer(String name, String email, String contactNumber) {
			this.name = name;
			this.email = email;
			this.contactNumber = contactNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		@Override
		public String toString() {
			return String.format("%-15s%-20s%-15s", this.name, this.email, this.contactNumber);
		}
		
		public static void CreateNewInstanceCustomer(){
			Customer c = new Customer();
			
			System.out.println("Enter Name : ");
			c.setName(sc.nextLine());
			System.out.println("Enter Email :");
			c.setEmail(sc.nextLine());
			System.out.println("Enter ContactNumber :");
			c.setContactNumber(sc.nextLine());

			 TestMap.addCustomerinArray(c);
		}
		 
	}


