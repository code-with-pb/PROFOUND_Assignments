package Exception;

public class AccForUserDefinedException {
		int bal;
		AccForUserDefinedException(){
			System.out.println("Account is Created SuccessFully...");
		}
		AccForUserDefinedException(int balance){
			bal = balance;
		}
		void deposite(int amt) {
			bal += amt;
			System.out.println("Amoutn is Deposited....");
		}
		public String toString() {
			return bal+" ";
		}
		void withdraw(int amt) {
			try {
				if(bal < amt) {
					throw new InsufficientFundsException();
					
				}
				else {
					bal -= amt;
					System.out.println("Amoutn is Withdrwal SuccessFully...");
				}
			}catch(InsufficientFundsException e) {
				e.print();
			}
		}
}
