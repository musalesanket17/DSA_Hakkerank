package acts.cdac.in;

import java.util.Objects;
import java.util.Scanner;

public class Account {
	public static Scanner sc = new Scanner(System.in);

	 private int account_no;
	 private String account_type;
	 private float account_balance;
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public float getAccount_balace() {
		return account_balance;
	}
	public void setAccount_balace(float account_balace) {
		this.account_balance = account_balace;
	}
	public Account(int account_no, String account_type, float account_balace) {
		this.account_no = account_no;
		this.account_type = account_type;
		this.account_balance = account_balace;
	}
	public Account() {
 	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10d%-15s%8.2f", this.account_no, this.account_type, this.account_balance);

	}
	
	public static void CreateNewInstance(){
		 Account account = new Account();
		 System.out.println("Enter account_no : ");
		 account.setAccount_no(sc.nextInt());
		 System.out.println("Enter account_type : ");
		 sc.nextLine();

		 account.setAccount_type(sc.nextLine());
		 System.out.println("Enter account_balance  : ");
		 account.setAccount_balace(sc.nextFloat());
		 
		 TestMap.addaccountinArray(account);
	}
	@Override
	public int hashCode() {
		return Objects.hash(account_no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return account_no == other.account_no;
	}
	
	 
}
