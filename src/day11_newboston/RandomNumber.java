package day11_newboston;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		System.out.println(r.nextInt());
		int i=0;
		int a[]=new int[5];
		while(i<5) {
			a[i]=r.nextInt();
			i++;
		}
		
		for(int e:a) {
			System.out.println(e);
		}

	}

}
