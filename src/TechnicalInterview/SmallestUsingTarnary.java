package TechnicalInterview;

import java.util.Scanner;

public class SmallestUsingTarnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int first,second, third, temp,smallest;
		
		System.out.println("Enter 1st numbre");
		first=sc.nextInt();
		System.out.println("Enter 2st numbre");
		second=sc.nextInt();
		System.out.println("Enter 3st numbre");
		third=sc.nextInt();
		
		temp=first<second?first:second;
		smallest=third<temp?third:temp;
		
		System.out.println("smallest numbre :"+smallest);

	}

}
