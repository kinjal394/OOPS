package FrequentlyAskProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Reverse number");
		int Num=s.nextInt();
		int rev=0;
		
		//first logic
		while(Num!=0) {
			rev = rev*10 + Num%10;
			Num=Num/10;
			
			//System.out.println(rev + " " + Num);
		}
		System.out.println(rev);
		
		//second logic 
		int val=1234;
		StringBuffer sb=new StringBuffer(String.valueOf(val));
		System.out.println(sb.reverse());
		
		//third logic
		int val3=3456;
		StringBuilder sbb=new StringBuilder(String.valueOf(val3));
		System.out.println(sbb.reverse());
	}

}
