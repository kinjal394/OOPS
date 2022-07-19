package FrequentlyAskProgram;

import java.util.Scanner;

public class SecondLargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		Integer numofele=s.nextInt();
		int a[]=new int[numofele];
		System.out.println("Enter arrays elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		//int a[]= {4,2,3,1,5,7,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int r:a) {
			System.out.println(r);
		}
		System.out.println("second largest = "+ a[a.length-2]);
	}

}
