package FrequentlyAskProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//natural number>1
		//which has only two factors 1 and itself
		//28 : 1,2,4,7,,14,28 is not prime
		//Prime number: 2,3,5,7,11,13,17,19,23,29,31
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int Number=s.nextInt();
		int count=0;
		if(Number>1) {
			for(int i=1;i<Number;i++) {
				if(Number%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(Number + " This is prime number");
			}else {
				System.out.println(Number + " This is not prime number"+ count);
			}
		}else {
			System.out.println("Number is not pelindrom ");
		}
	}

}
