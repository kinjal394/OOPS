package day11_newboston;

import java.util.Scanner;

public class AveragingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int grad,Total=0,count=0,Mark;
		while(count<10) {
			System.out.println("Enter grad marks");
			Mark=s.nextInt();
			Total = Total + Mark;
			count++;
		}
		
		System.out.println("Average =" + Total/10);

	}

}
