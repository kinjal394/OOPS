package FrequentlyAskProgram;

import java.util.ArrayList;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,3,4,5,5,6,5,7,8,9,5};
		ArrayList<Integer> al=new ArrayList<Integer>(); 
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
		
		
		///duplicate array
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					al.add(a[j]);
				}
			}
		}
		
		System.out.println("-----------duplicate array-----------------");
		for(int r:al) {
			System.out.println(r);
			}

	}

}
