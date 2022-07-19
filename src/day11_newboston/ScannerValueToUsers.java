package day11_newboston;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerValueToUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello java");
		Scanner s=new Scanner(System.in);
		//System.out.println(s.nextLine());
		int number=s.nextInt();
		ArrayList a=new ArrayList();
		for(int i=1;i<number;i++) {
			a.add(i);
			
		}
		
		System.out.println(a);
	}

}
