package TechnicalInterview;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=10000,withdrow, deposite;
		
		while(true) {
			System.out.println("Automated taller machine");
			System.out.println("choose 1 for withdrow");
			System.out.println("choose 2 for deposite");
			System.out.println("choose 3 for check balance");
			System.out.println("choose 4 for Exit");
			System.out.println("choose the operation you want to perform");
			
			int choice =sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter money to be withdrawn");
				withdrow=sc.nextInt();
				if(balance>=withdrow) {
					balance=balance-withdrow;
					System.out.println("collect your money");
				}else {
					System.out.println("unsufficient money");
				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("enter money to be deposite");
				deposite=sc.nextInt();
				balance=balance+deposite;
				System.out.println("your money has been successfully deposited");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("Current balance : "+balance);
				System.out.println("");
				break;
				
			case 4:
				System.exit(0);
			default:
				break;
			}
		}

	}

}
