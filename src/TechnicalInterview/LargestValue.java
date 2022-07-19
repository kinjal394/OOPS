package TechnicalInterview;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int first,second, third;
		
		System.out.println("Enter 1st numbre");
		first=sc.nextInt();
		System.out.println("Enter 2st numbre");
		second=sc.nextInt();
		System.out.println("Enter 3st numbre");
		third=sc.nextInt();
		
		if(first>second) {
			System.out.println("Largest number :"+first);
		}else if(second>third) {
			System.out.println("Largest number :"+second);
		}else if(third>first) {
			System.out.println("Largest number :"+third);
		}

	}

}
