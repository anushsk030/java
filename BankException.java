package anushjava;
import java.util.Scanner;
class Customer{
	int accountNumber;
	String accountName;
	String accountType;
	int accountBalance;
	Scanner sc=new Scanner(System.in);
	public void setDetails() {
		System.out.println("Enter Account Number");
		 accountNumber=sc.nextInt();
		System.out.println("Enter Account Holder Name");
		 accountName=sc.next();
		System.out.println("Enter the type of account");
		 accountType=sc.next();
		System.out.println("Enter the account balance");
		 accountBalance=sc.nextInt();
	}
	public void getDetails() {
		System.out.println("Account Number "+accountNumber);
		System.out.println("Name "+accountName);
		System.out.println("Type of Account"+accountType);
		System.out.println("Balance"+accountBalance);
		System.out.println("*********************************************************");
		
	}
}

public class BankException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Customers");
		int n=sc.nextInt();
		Customer []customer =new Customer[n];
		InvalidAmountException invalidamount=new InvalidAmountException("invalid Amount");
		InvalidFundException invalidfund=new InvalidFundException("in sufficient fund");
		
	int choice;
	
	for(int i=0;i<n;i++) {
		customer[i]=new Customer();
		customer[i].setDetails();
	}
	do {
		System.out.println("Enter the choice 1.Display Account Details");
		System.out.println(" 2.Search by account Number");
		System.out.println("3.Deposit the Amount");
		System.out.println("4.Withdraw the amount");
		System.out.println("5.exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			for(int i=0;i<n;i++) {
				customer[i].getDetails();
			}
			break;
		case 2:
			int searchAccount;
			System.out.println("enter account Number");
			searchAccount=sc.nextInt();
			for(int i=0;i<n;i++) {
				if(searchAccount==customer[i].accountNumber) {
					customer[i].getDetails();
					
				}
			}
			break;
		case 3:
			int depositAmount;
			System.out.println("enter account Number");
			searchAccount=sc.nextInt();
			System.out.println("Enter the amount to deposit");
			depositAmount=sc.nextInt();
			try {
			if(depositAmount<=0) {
				throw invalidamount;
			}
			else {
				for(int i=0;i<n;i++) {
					if(searchAccount==customer[i].accountNumber) {
				customer[i].accountBalance=customer[i].accountBalance+depositAmount;
				customer[i].getDetails();
			        }
				}
			}
			}catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			int withdrawAmount;
			System.out.println("enter account Number");
			searchAccount=sc.nextInt();
			System.out.println("Enter the amount to withdraw");
			withdrawAmount=sc.nextInt();
			try {
			if(withdrawAmount<=0) {
				throw invalidamount;
			}
			else {
				for(int i=0;i<n;i++) {
					if(searchAccount==customer[i].accountNumber) {
						if(withdrawAmount>customer[i].accountBalance) {
							throw  invalidfund;
						}
						else {
							customer[i].accountBalance=customer[i].accountBalance-withdrawAmount;
							customer[i].getDetails();
						}
							
						}
					}
			}
			}catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}catch(InvalidFundException e) {
				System.out.println(e.getMessage());
			}
			break;
			
			
			
			
		
			
		
	}
	}while(choice<5);

}
}
class InvalidAmountException extends Exception{
	 InvalidAmountException(String str) {
		 super(str);
		
	}
}
class InvalidFundException extends Exception{
	InvalidFundException(String str){
		super(str);
	}
}
