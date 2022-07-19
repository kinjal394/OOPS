package TechnicalInterview;

public class ReversArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,9,8,6,7};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("------------------------------------------------");
		
		for(int j=a.length-1;j>=0;j--) {
			System.out.println(a[j]);
		}
		
		

	}

}
