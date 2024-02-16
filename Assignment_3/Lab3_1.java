import java.util.*;

public class Lab3_1 {
	static class Account{
		int bal,id;
		Account(){
			System.out.println("Account is Created SuccessFully...");
		}
		Account(int balance,int id){
			bal = balance;
			this.id = id;
		}
		void deposite(int amt) {
			bal += amt;
			System.out.println("Amoutn is Deposited....");
		}
		public String toString() {
			return id+" "+bal;
		}
		void withdraw(int amt) {
			if(bal > amt) {
				bal -= amt;
				System.out.println("Amoutn is Withdrwal SuccessFully...");
			}
			else {
				System.out.println("Insufficient Balance....");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Acc_id: ");
		int n = sc.nextInt();
		System.out.print("Enter Amoutn for Deposite: ");
		int amt = sc.nextInt();
		System.out.print("Enter Amoutn for WithDrawl: ");
		int at = sc.nextInt();
		
		Account ac = new Account(0,n);
		
		ac.deposite(amt);
		System.out.println("Now Amoutn is: "+ac.toString());
		ac.withdraw(at);
	}

}
