package FrequentlyAskProgram;

import java.util.Scanner;



public class NumBaseOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		if(num%32==0) {
			System.out.println("Animal");
		}else if(num%16==0){
			System.out.println("anim");
		}else if (num%8==0) {
			System.out.println("an");
		}else {
			System.out.println("number is not divisible by 8,16,32");
		}
	}

}
