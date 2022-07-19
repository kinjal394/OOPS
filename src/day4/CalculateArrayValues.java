package day4;

public class CalculateArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int specificNumber=40;
		//sum array elements
		int sum=0;
		for (int r:a) {
			sum +=r;
			if(specificNumber==r) {
				System.out.println("this number is inside array " + r);
			}
		}
		System.out.println(sum);
		
		//string matching
		String s[]= {"welcome","To","Canada"};
		String macthingString="to";
		for (String T:s) {
			if(T.equalsIgnoreCase(macthingString)) {
				System.out.println("This string is matching inside ArrayString ="+T );
			}
		}
		
		//even odd number in array
		int b[]= {1,2,3,4,5,6,7,8,9,11,22,33,44,55};
		for(int y:b) {
			if(y%2==0) {
				System.out.println("Even number "+y);
			}else {
				System.out.println("Odd number "+y);
			}
		}
		
		//smalest and gretest number
		int k[]= {22,33,44,55,1,2,3,4};
		int largest=a[0];
		int small=a[0];
		for(int i=1;i<k.length;i++) {
			if(k[i]>largest) {
				largest=k[i];
			}
			if(k[i]<small) {
				small=k[i];
			}
		}
		System.out.println("largest=" +largest);
		System.out.println("small=" + small);
	}

}
