package FrequentlyAskProgram;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num=num/10;
		}
		//System.out.println(rev);
		if(rev==org_num) {
			System.out.println("This number is palindom "+ rev);
		}else {
			System.out.println("This number is not palindom "+ rev);
		}
		
		//for string 
		
		//System.out.println("Enter string");
		String st="mem";
		String Org_str=st;
		String revStr="";
		for(int i=0;i<st.length();i++) {
			revStr =  st.charAt(i)+revStr;
		}
		
		//System.out.println(revStr);
		if(revStr==Org_str) {
			System.out.println("This number is palindom "+ revStr);
		}else {
			System.out.println("This number is not palindom "+ revStr);
		}
	}
	
	
}
