package accessModifier2;
import accessModifiers.simple;

public class SempleTest extends simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SempleTest o=new SempleTest();
		o.m1();
		
		int a[]= {1,2,3,4,55,11,0};
		int large=a[0];
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
				
			}
			if(a[i]<small) {
				small=a[i];
				
			}
		}
		System.out.println("larger="+ large);
		System.out.println("small="+ small);
	}
}
